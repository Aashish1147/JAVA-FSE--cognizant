# Exercise 4: Difference between JPA, Hibernate and Spring Data JPA

## Objective

To understand the differences between JPA, Hibernate, and Spring Data JPA and learn how they work together in enterprise Java applications.

---

## Introduction

Database operations are a fundamental part of modern applications. Java provides multiple technologies to simplify communication between applications and relational databases.

The three commonly used technologies are:

1. JPA (Java Persistence API)
2. Hibernate
3. Spring Data JPA

Although they are related, each serves a different purpose.

---

## 1. JPA (Java Persistence API)

### Definition

JPA is a Java specification for Object Relational Mapping (ORM).

It defines a standard way to map Java objects to database tables and perform database operations.

### Key Points

* JPA is only a specification.
* It does not contain actual implementation.
* It provides annotations such as:

  * @Entity
  * @Table
  * @Id
  * @OneToMany
  * @ManyToOne

### Example

```java
@Entity
public class Employee {

    @Id
    private int id;

    private String name;
}
```

### Advantages

* Standard API.
* Database independent.
* Portable across implementations.

---

## 2. Hibernate

### Definition

Hibernate is an ORM framework that implements JPA.

It provides the actual implementation required to perform database operations.

### Key Points

* Implements JPA specifications.
* Automatically generates SQL queries.
* Handles CRUD operations efficiently.
* Supports caching and advanced ORM features.

### Example

```java
Session session = sessionFactory.openSession();

session.save(employee);

session.close();
```

### Advantages

* Reduces SQL coding.
* Powerful ORM capabilities.
* Widely used in enterprise applications.

---

## 3. Spring Data JPA

### Definition

Spring Data JPA is a Spring module built on top of JPA and Hibernate.

It simplifies database access by reducing boilerplate code.

### Key Points

* Uses JPA internally.
* Usually uses Hibernate as implementation.
* Provides repository interfaces.
* Automatic query generation.

### Example

```java
@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {
}
```

Usage:

```java
employeeRepository.save(employee);
```

### Advantages

* Very less code.
* Faster development.
* Built-in CRUD operations.
* Easy integration with Spring Boot.

---

## Relationship Between Them

JPA defines the rules.

Hibernate implements those rules.

Spring Data JPA simplifies usage of Hibernate and JPA.

Flow:

JPA → Hibernate → Spring Data JPA

---

## Comparison Table

| Feature             | JPA                 | Hibernate        | Spring Data JPA    |
| ------------------- | ------------------- | ---------------- | ------------------ |
| Type                | Specification       | Framework        | Spring Module      |
| Implementation      | No                  | Yes              | Uses JPA/Hibernate |
| ORM Support         | Standard Definition | Full ORM Support | Simplified ORM     |
| CRUD Operations     | Manual              | Manual           | Built-in           |
| Boilerplate Code    | Medium              | High             | Very Low           |
| Ease of Development | Medium              | Medium           | High               |
| Learning Curve      | Easy                | Moderate         | Easy               |

---

## Real-World Usage

Most Spring Boot applications use:

Spring Data JPA + Hibernate + JPA

Developers usually create repository interfaces and Spring Data JPA automatically handles database operations while Hibernate performs the actual ORM processing.

---

## Conclusion

* JPA is a specification.
* Hibernate is an implementation of JPA.
* Spring Data JPA is a higher-level abstraction built on top of JPA and Hibernate.

Together they simplify database interaction and significantly reduce development effort in enterprise Java applications.
