# Contact Service – Software Testing & Automation

## Project Overview

The **Contact Service** project is a Java-based backend service designed to manage contact records while enforcing strict validation rules and reliability through automated unit testing. This project demonstrates core software testing principles, defensive programming, and quality assurance best practices.

The service provides functionality to create, store, update, and validate contact information while ensuring data integrity through automated tests.

---

## Technologies Used

- **Java**
- **JUnit 5**
- **Eclipse IDE**
- **Object-Oriented Programming (OOP)**

---

## Features

- Create and manage contact records
- Enforce validation rules for:
  - Contact ID
  - First name
  - Last name
  - Phone number
  - Address
- Prevent invalid or duplicate contact entries
- Update existing contact information
- Automated unit tests covering both valid and invalid scenarios

---

## Project Structure
Contact Service/
├── src/
│ ├── Contact.java
│ ├── ContactService.java
│ ├── ContactTest.java
│ └── ContactServiceTest.java
├── bin/
│ └── Compiled class files
└── .project / .classpath (Eclipse configuration)


---

## Validation Rules

- **Contact ID**
  - Required
  - Must be unique
  - Maximum length enforced
- **First & Last Name**
  - Cannot be null
  - Length restrictions enforced
- **Phone Number**
  - Must be exactly 10 digits
- **Address**
  - Cannot be null
  - Maximum character limit enforced

Invalid data inputs are rejected using defensive checks and exceptions.

---

## Testing Strategy

Automated tests were written using **JUnit** to verify:

- Successful creation of valid contact records
- Rejection of invalid inputs
- Proper updates to existing contacts
- Exception handling for edge cases

The tests ensure the service behaves correctly under both expected and unexpected conditions.

---

## Learning Outcomes

- Applied object-oriented design principles
- Implemented defensive programming techniques
- Designed and executed automated unit tests
- Strengthened understanding of software quality assurance
- Practiced writing testable and maintainable Java code

---

## Career Relevance

This project demonstrates practical experience with:

- Software testing and automation
- Unit testing with JUnit
- Backend service validation logic
- Writing clean, test-driven Java code

It serves as a strong portfolio example for **Junior Software Engineer**, **QA Engineer**, or **Test Automation** roles.

---

## Author

**Darius Quick**  
Software Test Automation & Full Stack Development Student

