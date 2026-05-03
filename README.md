# Student Management System (Java)

# Overview

This is a simple console-based Student Management System developed using Java.
It allows users to perform basic operations such as adding, viewing, searching, and deleting student records.

The program demonstrates core Java concepts such as:
- Classes & Objects
- Encapsulation
- ArrayList (Collections)
- File Handling (FileWriter, BufferedReader)
- User input using Scanner
- Control statements (loops & conditions)

# Features
- Add a new student
- View all students
- Search student by ID
- Delete student
- Persistent data storage using file handling
- Exit the application

# Project Structure
- Student.java
- FileManager.java
- StudentApp.java
- students.txt

# Student.java

Represents the Student object with:
- Fields: id, name, age
- Constructor for initialization
- Method to convert object → file format (CSV)
- Method to convert file data → object
- toString() method for display

# FileManager.java

Handles file operations:
- Save student data to file
- Load student data from file
- Uses FileWriter and BufferedReader

# StudentApp.java

Main class that:
- Stores students using ArrayList
- Provides menu-driven interface
- Handles operations like add, view, search, delete
- Updates file after deletion

# How to Run

Step 1: Compile the program
- javac Student.java FileManager.java StudentApp.java
Step 2: Run the program
- java StudentApp

# Sample Menu
--- Student Management System ---
1. Add Student
2. View Students
3. Search Student
4. Delete Student
5. Exit

# Example Usage
- Add students with ID, name, and age
- View all stored student records
- Search for a student using ID
- Delete student records when needed

# Data Storage

Data is stored in:
- students.txt

Format:
- id,name,age

Example:
- 101,John,20102,Alice,19

# Limitations
- No validation for duplicate IDs
- Basic console interface (no GUI)
- Manual file handling (no database)

# Future Improvements
- Add update functionality
- Implement input validation
- Integrate database (MySQL / SQLite)
- Build GUI using JavaFX or Swing

# Learning Outcome

This project helps beginners understand:
- Object-Oriented Programming (OOP)
- File handling in Java
- Collections (ArrayList)
- Building menu-driven applications

# License
- This project is free to use for learning purposes.





