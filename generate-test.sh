#!/bin/bash

# Arguments to Generator with name of class to test
SEED=0
NUMTESTS=1000
CLASSNAME=C3

# Compile Generator
javac pset3/Generator.java

# Compile the class (class has package pset3 so assume is under pset3/)
javac pset3/${CLASSNAME}.java

for i in {1..50}
do
SEED=$i
# Generate test class
java -cp . pset3.Generator ${SEED} ${NUMTESTS} ${CLASSNAME} > pset3/${CLASSNAME}Test.java

# Compile test class
javac -cp ".;libs/junit-4.12.jar" pset3/${CLASSNAME}Test.java

# Run test class
java -cp ".;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore pset3.${CLASSNAME}Test
done
