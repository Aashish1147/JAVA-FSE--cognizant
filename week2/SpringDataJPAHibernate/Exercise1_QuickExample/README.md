# Exercise 1 - Spring Data JPA Quick Example

## Aim
Create a simple Spring Boot application using Spring Data JPA and Hibernate.

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Project Structure

src
└── main
    ├── java
    │   └── com.cognizant.ormlearn
    │       ├── model
    │       │   └── Country.java
    │       ├── repository
    │       │   └── CountryRepository.java
    │       ├── service
    │       │   └── CountryService.java
    │       └── OrmLearnApplication.java
    └── resources
        └── application.properties

## Output

Hibernate: insert into country (name,code) values (?,?)
Country Saved

BUILD SUCCESS

## Result

Successfully created and executed a Spring Data JPA application using Hibernate.