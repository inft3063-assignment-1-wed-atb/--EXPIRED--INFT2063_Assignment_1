#!/bin/sh

##
# Set some variables. 
MAIN_FILE=CashRegister

# TODO:: Check if the classes folder exists


# compile the classes
echo 'Compiling the java classes...'
javac -d classes source/*.java
echo 'compilation complete.\n\n'

# Run the program
echo 'Running the java program'
java -cp classes CashRegister


# Clean up
echo 'Cleaning built files'
rm classes/*.class
echo 'Operations complete.'
