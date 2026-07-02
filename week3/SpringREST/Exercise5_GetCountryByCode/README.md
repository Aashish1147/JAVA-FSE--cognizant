# Exercise 5 - REST Get Country by Country Code

## Objective

Create a Spring Boot REST API that returns country details based on the country code provided in the URL using `@PathVariable`.

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Context
- Maven

## Project Structure

```
Exercise5_GetCountryByCode
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

## Endpoints

```
GET /country/IN
GET /country/US
GET /country/JP
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