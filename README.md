# University Event Management

## Overview
The University Event Management Backend is a Java-based application designed to manage and organize university events, student information, and departments. It provides features for event registration, student data management, and department updates.

## Frameworks and Technologies Used
- **Spring Boot:** The application is built using the Spring Boot framework for Java, providing a robust and efficient foundation for web development.
- **Spring Data JPA:** This framework simplifies database operations using Java Persistence API (JPA), making it easier to interact with the database.
- **H2 Database:** The application uses the H2 in-memory database for data storage, making it easy to set up and test.
- **Lombok:** Lombok reduces boilerplate code by generating getters, setters, and constructors, improving code readability.
- **Java Persistence API (JPA):** JPA is used for object-relational mapping to interact with the H2 database.

## Data Flow
The project follows a typical Spring Boot architecture with the following components:

1. **Controllers:** The `EventController` and `StudentController` handle incoming HTTP requests, interact with services, and return appropriate responses.

2. **Services:** The `EventService` and `StudentService` contain the business logic for event and student management, respectively.

3. **Repositories:** The `IeventRepo` and `IstudentRepo` interfaces provide data access methods to interact with the H2 database.

## Database Design and Data Structure
### EventModel
- `eventId` (Integer): Unique identifier for each event.
- `eventName` (String): The name of the event.
- `locationOfEvent` (String): The event's location.
- `date` (LocalDate): The date of the event.
- `startTime` (LocalTime): The event's start time.
- `endTime` (LocalTime): The event's end time.

### StudentModel
- `studentId` (Integer): Unique identifier for each student.
- `fist_name` (String): First name of the student.
- `last_name` (String): Last name of the student.
- `age` (Integer): Age of the student.
- `department` (Type Enum): The student's department (e.g., ME, ECE, CSE).

## Project Summary
The University Event Management Backend is a Java-based application that serves as the backend for managing university events, student information, and departments. It leverages Spring Boot, Spring Data JPA, and an H2 in-memory database for efficient data handling. The system follows a RESTful API architecture and includes controllers, services, and repositories to manage events and student data. This README provides an overview of the project's structure, technologies used, and data flow, along with a brief explanation of the database design and data structure.

Feel free to explore the codebase and documentation for more details on how to use and extend the backend system.
