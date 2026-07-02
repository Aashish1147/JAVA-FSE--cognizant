# Exercise 4 - REST Country Web Service

## Objective

Create a Spring Boot REST application that returns a Country object as JSON using Spring Configuration XML.

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Context
- Maven

## Project Structure

```
Exercise4_CountryRESTService
│
├── pom.xml
├── README.md
├── Output.png
└── src
    └── main
        ├── java
        │   └── com
        │       └── cognizant
        │           └── springrest
        │               ├── SpringRestApplication.java
        │               ├── controller
        │               │      CountryController.java
        │               └── model
        │                      Country.java
        └── resources
            └── applicationContext.xml
```

## Endpoint

```
GET /country
```

## Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

## Run

```bash
mvn spring-boot:run
```