# Exercise 2: Dependency Injection

## Objective

Demonstrate Dependency Injection using the Spring Framework.

## Project Structure

- BookRepository
- BookService
- LibraryManagementApplication
- applicationContext.xml

## Concepts Used

- Spring IoC Container
- Dependency Injection (Setter Injection)
- XML Bean Configuration

## Implementation

BookRepository is created as a Spring bean.

BookService depends on BookRepository.

The dependency is injected through the applicationContext.xml configuration file.

## Output

Book Service Loaded

Book Repository Loaded

## Result

Successfully implemented Dependency Injection using Spring Framework.