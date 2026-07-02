# Exercise 1: Mocking and Stubbing

## Aim
To demonstrate Mocking and Stubbing using Mockito.

## Tools Used
- Java
- Maven
- JUnit 4
- Mockito

## Files

### ExternalApi.java
Interface representing an external service.

### MyService.java
Uses ExternalApi to fetch data.

### MyServiceTest.java
Creates a mock object and stubs method behavior using Mockito.

## Mockito Concepts Used

### Mocking
A mock object replaces the actual dependency.

```java
ExternalApi mockApi = mock(ExternalApi.class);