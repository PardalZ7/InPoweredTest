# Java Challange for InPowered - By Alexandre Cardoso
This program will recieve a text file input that contains a list of people (name, sex, birthday)

## Installation Step
1. Must have installed the Java JDK and Maven in your personal computer
2. Using any version controller system, download the source code to your local repository
3. Using the cmd tool, navigate to the system path
4. Build the application using the comand **mvn clean install**.

## Executing
1. After the installation process, stay at the same directory and use
    1. On Windows: **java -jar .\target\InPoweredTest-1.0-SNAPSHOT.jar**
    2. On Linux-like OS, **java -jar target/InPoweredTest-1.0-SNAPSHOT.jar** (not tested)

## Operations
    - Read File: Parse the input file **_Mandatory to the next operations_**.
    - Print File: Print the parsed file
    - Count by Sex: Count how many people at the parsed file match whit the sex option selected
    - The oldest person: Returns the oldest person at the parsed file
    - Difference between (days): Returns the difference, in days, between the birthday date of two selected people. 
    If the first date is bigger than the second, the difference will be negative.
    - Exit: Terminate system execution