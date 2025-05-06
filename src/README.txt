README - Java Exercises Compilation and Execution Guide
=======================================================

This document explains how to compile and run each Java exercise (Ex1 to Ex5)
from the command line, using relative paths and standard Java tools.

----------------------------------------------------------------
Ex1: List files in a directory alphabetically
----------------------------------------------------------------
Compile:
    javac src\main\java\Ex1.java

Run (with resources folder):
    java -cp src\main\java Ex1 src\main\resources

----------------------------------------------------------------
Ex2: Recursively list a directory tree, ordered alphabetically
----------------------------------------------------------------
Compile:
    javac src\main\java\Ex2.java

Run:
    java -cp src\main\java Ex2 src\main\resources

----------------------------------------------------------------
Ex3: Save the recursive listing into a TXT file
----------------------------------------------------------------
Compile:
    javac src\main\java\Ex3.java

Run:
    java -cp src\main\java Ex3 src\main\resources

Output:
    Creates 'directory_output.txt' in the project root directory.

----------------------------------------------------------------
Ex4: Read a TXT file and display its content in the console
----------------------------------------------------------------
Compile:
    javac src\main\java\Ex4.java

Run (example with a file that has spaces in its name):
    java -cp src\main\java Ex4 "src\main\resources\message (1).txt"

----------------------------------------------------------------
Ex5: Serialize and deserialize a Java object
----------------------------------------------------------------
Compile:
    javac src\main\java\Animal.java
    javac src\main\java\Ex5.java

Run:
    java -cp src\main\java Ex5

Output:
    Creates 'animal.ser' and prints the deserialized object.
