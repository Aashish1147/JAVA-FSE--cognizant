# Exercise 2 – Spring Core: Load Country from Spring Configuration XML

## Objective

The objective of this exercise is to learn how to configure and load Spring beans using an XML configuration file. A `Country` bean is defined in `applicationContext.xml` and retrieved in the Spring application.

---

## Project Structure

```
Exercise2_LoadCountryFromXML
│── pom.xml
│── README.md
└── src
    └── main
        ├── java
        │   └── com
        │       └── cognizant
        │           └── springrest
        │               ├── SpringRestApplication.java
        │               └── model
        │                   └── Country.java
        └── resources
            └── applicationContext.xml
```

---

## Technologies Used

- Java 17
- Spring Context
- Maven

---

## Files Description

### Country.java
Represents the Country model with two properties:
- code
- name

Includes:
- Getters & Setters
- Parameterized Constructor
- Default Constructor
- toString() method

---

### applicationContext.xml

Defines the Country bean.

```xml
<bean id="country" class="com.cognizant.springrest.model.Country">
    <property name="code" value="IN"/>
    <property name="name" value="India"/>
</bean>
```

---

### SpringRestApplication.java

- Loads the Spring XML configuration.
- Retrieves the Country bean.
- Prints the Country details.

---

## Steps Performed

1. Created a Maven project.
2. Added Spring Context dependency.
3. Created the Country model class.
4. Configured the Country bean in `applicationContext.xml`.
5. Loaded the XML configuration using `ClassPathXmlApplicationContext`.
6. Retrieved the bean using `getBean()`.
7. Printed the Country object.

---

## Build & Run

Compile the project

```bash
mvn compile
```

Run the application

```bash
mvn exec:java -Dexec.mainClass="com.cognizant.springrest.SpringRestApplication"
```

---

## Output

```
Country [code=IN, name=India]
```

---

## Learning Outcome

After completing this exercise, I learned:

- Spring Bean Configuration using XML
- Spring IoC (Inversion of Control)
- Dependency Injection using XML
- Loading Spring Application Context
- Retrieving beans using `getBean()`

---

## Status

✅ Exercise Completed Successfully