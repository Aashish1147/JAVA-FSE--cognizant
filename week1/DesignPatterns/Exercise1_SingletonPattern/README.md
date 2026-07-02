# Exercise 1: Implementing the Singleton Pattern

## Objective

The objective of this exercise is to implement the Singleton Design Pattern in Java and ensure that only one instance of a class is created throughout the application lifecycle.

---

## Problem Statement

Create a Logger utility class that follows the Singleton Design Pattern.

Requirements:

- The Logger class should have only one instance.
- The constructor should be private.
- A static method should provide global access to the single instance.
- Demonstrate that multiple calls return the same object.

---

## Files

### Logger.java

Contains the Singleton implementation.

### TestLogger.java

Contains the main method used to test the Singleton behavior.

### output.png

Screenshot of the program output.

---

## Concepts Used

- Singleton Design Pattern
- Object-Oriented Programming (OOP)
- Private Constructor
- Static Variables
- Static Methods
- Global Access Point

---

## Implementation

1. Created a private static instance of Logger.
2. Made the constructor private to prevent direct object creation.
3. Implemented the `getInstance()` method to return the same object every time.
4. Verified Singleton behavior by comparing object references and hashcodes.

---

## Expected Output

```text
Logger instance created
LOG: First message
LOG: Second message
logger1 hashcode: XXXXXXXX
logger2 hashcode: XXXXXXXX
Both references point to the same instance
```

---

## Result

Successfully implemented the Singleton Design Pattern.

The Logger object is created only once and reused throughout the application, confirming the Singleton behavior.

---