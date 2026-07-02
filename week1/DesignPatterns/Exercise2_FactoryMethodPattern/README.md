# Exercise 2: Implementing the Factory Method Pattern

## Objective

To implement the Factory Method Design Pattern in Java and understand how object creation can be delegated to factory classes.

---

## Problem Statement

Create a document management system that supports multiple document types:

- Word Document
- PDF Document
- Excel Document

Use the Factory Method Pattern so that object creation is handled by factory classes rather than directly creating objects.

---

## Classes Implemented

### Product Interface

- Document

### Concrete Products

- WordDocument
- PdfDocument
- ExcelDocument

### Factory Classes

- DocumentFactory
- WordDocumentFactory
- PdfDocumentFactory
- ExcelDocumentFactory

### Test Class

- TestFactory

---

## Expected Output

Opening Word Document

Opening PDF Document

Opening Excel Document

---

## Result

Successfully implemented the Factory Method Design Pattern in Java.

The program creates different document types using their respective factory classes and demonstrates abstraction of object creation.