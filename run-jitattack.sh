#!/bin/bash

# Usage: ./run.sh [CLASSNAME] [NUMBER_GENERATED_PROGRAMS]
# For example, ./run.sh T 3 will generate 3 programs from template
# program pset3/T.java. Assume every template program has package
# pset3.

# Check java version must be 11.
version="$( java -version 2>&1 | head -n 1 | cut -d '"' -f 2 | cut -d '.' -f 1 )"
if [[ $version != 11 ]]; then
        echo "ERROR: Please use Java 11!" >&2
        exit 1
fi

# Accept inputs
class="${1:-T}"; shift # default T
n_outputs="${1:-3}"; shift # default 3

# Other configurations we may want to touch
class="pset3.${class}"
src="$( pwd )/${class//\./\/}.java"
readonly n_invocations=100000
readonly modes=( level4 level1 )
readonly seed=42

# Constants
readonly JITATTACK_JAR="$( pwd )/libs/jitattack.jar"
readonly DOT_DIR="$( pwd )/.jitattack"
rm -rf ${DOT_DIR} && mkdir -p ${DOT_DIR}
readonly template_dir=${DOT_DIR}/${class}
readonly build_dir=${template_dir}/build
readonly gen_dir=${template_dir}/gen
readonly output_dir=${template_dir}/output

mkdir -p ${build_dir}
mkdir -p ${gen_dir}
mkdir -p ${output_dir}

readonly STOP_AT_LEVEL="-XX:TieredStopAtLevel=" # followed by level number
readonly EXTRA_JAVA_FLAGS=""
readonly n_exec_itrs=""

# Compile the template
if [[ ! -f ${src} ]]; then
        echo "ERROR: file not found: ${src}" >&2
        exit 1
fi
javac -cp ${JITATTACK_JAR} ${src} -d ${build_dir}
if [[ $? -ne 0 ]]; then
        exit 1
fi

# Generate programs from the template using JITAttack
java -cp ${JITATTACK_JAR} sketchy.driver.Driver \
     --ss=random \
     --seed=${seed} \
     --nOutputs=${n_outputs} \
     --outputDir=${gen_dir} \
     --clzName=${class} \
     --srcPath=${src} \
     --nInvocations=${n_invocations} \
        || exit 1

# Print a message
num_gen=$( find ${gen_dir} -name "*.java" | wc -l )
echo "${num_gen} programs are generated in ${gen_dir}."

# Do differential testing for every generated program
CP="${build_dir}:${JITATTACK_JAR}"
fail_clzes=()
for file in $( find ${gen_dir} -name "*.java" | sort -V ); do
        gen_clz="$( basename "${file}" | cut -d '.' -f 1 )"
        output_dir_per_gen="${output_dir}/${gen_clz}"
        rm -fr ${output_dir_per_gen} && mkdir -p ${output_dir_per_gen}

        # echo "${gen_clz}"

        # Compile
        javac -cp ${JITATTACK_JAR} ${file} -d ${build_dir}
        if [[ $? -ne 0 ]]; then
                echo "ERROR: ${file} cannot compile!" >&2
                exit 1
        fi

        # Run at all modes
        for mode in "${modes[@]}"; do
                # echo "Running ${mode}..."

                output_file="${output_dir_per_gen}/${gen_clz}-${mode}.txt"
                case "${mode}" in
                'default')
                        java -cp ${CP} \
                             ${EXTRA_JAVA_FLAGS} \
                             ${gen_clz} ${n_exec_itrs} \
                             >"${output_file}" 2>&1
                        ;;
                'level'[01234])
                        level="${mode: -1}"
                        java -cp ${CP} \
                             ${EXTRA_JAVA_FLAGS} \
                             ${STOP_AT_LEVEL}${level} \
                             ${gen_clz} ${n_exec_itrs} \
                             >"${output_file}" 2>&1
                        ;;
                'c1')
                        java -cp ${CP} \
                             ${EXTRA_JAVA_FLAGS} \
                             -Xbatch -Xcomp ${STOP_AT_LEVEL}1 \
                             ${gen_clz} ${n_exec_itrs} \
                             >"${output_file}" 2>&1
                        ;;
                'c2')
                        java -cp ${CP} \
                             ${EXTRA_JAVA_FLAGS} \
                             -Xbatch -Xcomp -XX:-TieredCompilation \
                             ${gen_clz} ${n_exec_itrs} \
                             >"${output_file}" 2>&1
                        ;;
                *)
                        echo "ERROR: unsupported mode: ${mode}" >&2
                        exit 1
                        ;;
                esac
                # cat ${output_file}
        done

        # Compare every two modes
        for (( i=0 ; i < ${#modes[@]} ; i+=1 )); do
                for (( j=$(( ${i}+1 )) ; j < ${#modes[@]} ; j+=1 )); do
                        modeA=${modes[i]}
                        modeB=${modes[j]}

                        diff_file="${output_dir_per_gen}/${gen_clz}-${modeA}-${modeB}-diffs.txt"
                        diff "${output_dir_per_gen}/${gen_clz}-${modeA}.txt" \
                             "${output_dir_per_gen}/${gen_clz}-${modeB}.txt" \
                             >"${diff_file}"
                        if [[ ! -s "${diff_file}" ]]; then
                                # remove empty diff file
                                rm -f "${diff_file}"
                        else
                                echo "${gen_clz}: ${modeA} differs with ${modeB}!" >&2
                                fail_clzes+=( "${gen_clz}" )
                        fi
                done
        done
done

# Print results
if [[ ${#fail_clzes[@]} -eq 0 ]]; then
        echo "All passed!"
else
        echo "${fail_clzes[*]} failed!" >&2
fi
