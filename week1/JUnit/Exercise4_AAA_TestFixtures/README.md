# Exercise 4: AAA Pattern and Test Fixtures

## Objective
To understand and implement the Arrange-Act-Assert (AAA) testing pattern using JUnit.

## Tools Used

- Java
- Maven
- JUnit 4.13.2
- VS Code

## Project Structure

```
Exercise4_AAA_TestFixtures
│
├── src
│   ├── main
│   │   └── java
│   │       └── Calculator.java
│   │
│   └── test
│       └── java
│           └── CalculatorTest.java
│
├── pom.xml
├── README.md
└── Output.png
```

## AAA Pattern

### Arrange
Create required objects and prepare test data.

### Act
Execute the method under test.

### Assert
Verify the expected output.

## Execution

Run:

```bash
mvn test
```

## Expected Output

```text
Tests run: 1
Failures: 0
Errors: 0

BUILD SUCCESS
```

## Result

Successfully implemented JUnit test cases using the Arrange-Act-Assert (AAA) testing pattern.