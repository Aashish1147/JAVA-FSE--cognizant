# Exercise 3 - Hello World RESTful Web Service

## Objective

Create a Spring Boot REST application that exposes a simple REST endpoint returning "Hello World!!".

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Maven

## Project Structure

```
Exercise3_HelloWorldREST
│
├── pom.xml
├── README.md
├── Output.png
└── src
    └── main
        └── java
            └── com
                └── cognizant
                    └── springrest
                        ├── SpringRestApplication.java
                        └── controller
                            └── HelloController.java
```

## Endpoint

```
GET /hello
```

## Output

```
Hello World!!
```

## Run

```
mvn spring-boot:run
```