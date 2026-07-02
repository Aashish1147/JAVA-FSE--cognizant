# Exercise 2: Verifying Interactions

## Aim
To verify interactions between objects using Mockito.

## Tools Used
- Java
- Maven
- JUnit 4
- Mockito

## Files

### ExternalApi.java
Interface containing a method to simulate an external service.

### MyService.java
Calls the method from ExternalApi.

### MyServiceTest.java
Verifies that the mocked method was invoked.

## Mockito Concept Used

### Verify Interaction

```java
verify(mockApi).getData();