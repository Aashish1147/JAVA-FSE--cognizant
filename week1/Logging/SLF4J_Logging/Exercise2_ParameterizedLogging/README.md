# Exercise 2 - Parameterized Logging

## Objective
Demonstrate parameterized logging using the SLF4J logging framework.

## Technologies Used
- Java
- Maven
- SLF4J
- Logback

## Project Structure

Exercise2_ParameterizedLogging
│
├── pom.xml
├── README.md
├── Output.png
└── src
    └── main
        └── java
            └── ParameterizedLoggingExample.java

## Code Description

The application demonstrates parameterized logging using placeholders `{}`.

Example:

```java
logger.info("User {} is {} years old", username, age);