#!/bin/bash

# Arguments to Generator with name of class to test

# Compile Generator
javac pset3/Generator.java

# Compile the class (class has package pset3 so assume is under pset3/)
javac pset3/C1.java

# Generate test class
java -cp . pset3.Generator 6 3000 C1 > pset3/C1Test.java

# Compile test class
javac -cp .;libs/junit-4.12.jar pset3/C1Test.java

# Run test class
java -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore pset3.C1Test
