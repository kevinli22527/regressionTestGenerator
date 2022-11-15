#!/bin/bash

# Arguments to Generator
SEED=0
NUMTESTS=5000

# Compile Generator
javac pset3/Generator.java

# Compile Account
javac pset3/Account.java

# Generate AccountTest
java -cp . pset3.Generator ${SEED} ${NUMTESTS} > pset3/AccountTest.java

# Compile AccountTest
javac -cp ".;libs/junit-4.12.jar" pset3/AccountTest.java

# Run AccountTest
java -cp ".;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore pset3.AccountTest
