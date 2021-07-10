# Using Command Prompt (Alternative)

This is a guide on how to compile and execute Java programs through the Command Prompt

<br>

## Tools Needed

- JDK
- Command Prompt

<br>

## Steps

1. Open the command prompt
2. Enter this command:
    - Example: `path c:\Program Files\Java\jdk1.8.0_144\bin`
    - **Note:** drive `c` and jdk version `jdk.1.8.0_144` may vary depending on your setup
3. Navigate to the folder where the file is located using cd command
    - Example: `cd Documents\Programs`
    - If you have a different drive, you can switch to it by entering the drive name
    - Example: `d:`
4. Enter this to compile: `javac [fileName].java`
    - Example: `javac Calculator.java`
    - You only need to do this if there is no class file, or if you made changes in the Java file
5. Enter this to execute: `java [fileName]`
    - Example: `java Calculator`
