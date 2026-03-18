# Student Management System

A comprehensive web application for managing student records, built with Java Spring Boot and modern web technologies.

## 📋 Overview

This Student Management System allows administrators to efficiently manage student information including personal details, contact information, and course enrollment. The application provides a user-friendly web interface for performing CRUD (Create, Read, Update, Delete) operations on student data.

## ✨ Features

- **Student Management**: Add, view, update, and delete student records
- **Search Functionality**: Search students by name (case-insensitive)
- **Database Integration**: MySQL database with JPA/Hibernate ORM
- **RESTful Architecture**: Clean separation of concerns with MVC pattern
- **Data Validation**: Form validation for data integrity

## 🛠️ Technologies Used

- **Backend**: Java 21, Spring Boot 3.5.10
- **Database**: MySQL 8.x with JPA/Hibernate
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap 5.3.2
- **Build Tool**: Maven
- **Development Tools**: Spring DevTools

## 📋 Prerequisites

Before running this application, make sure you have the following installed:

- **Java 21** or higher
- **MySQL 8.x** database server
- **Maven 3.6+** (or use the included Maven wrapper)
- **Git** (for cloning the repository)


## 📖 Usage

### Accessing the Application
1. Open your web browser and navigate to `http://localhost:8081`
2. You'll see the student list page with existing records

### Managing Students

#### Add New Student
- Click the **"+ Add Student"** button
- Fill in the student details (Name, Email, Course)
- Click **"Save Student"** to add the record

#### Update Student Information
- Click the **"Update"** button next to any student
- Modify the information in the form
- Click **"Save Student"** to update

#### Delete Student
- Click the **"Delete"** button next to any student
- Confirm the deletion (the record will be permanently removed)

#### Search Students
- Use the search bar at the top of the page
- Enter a name (or part of a name) to filter results
- Click **"Search"** or press Enter
- Click **"Reset"** to show all students

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/com/StudentManagementSystem/
│   │   ├── Student.java                    # Entity class
│   │   ├── StudentController.java          # Web controller
│   │   ├── StudentRepository.java          # Data access layer
│   │   ├── StudentService.java             # Business logic interface
│   │   ├── StudentServiceImpl.java         # Business logic implementation
│   │   └── StudentManagementSystemApplication.java  # Main application class
│   └── resources/
│       ├── application.properties          # Configuration
│       └── templates/                      # Thymeleaf templates
│           ├── index.html                  # Student list page
│           └── add.html                    # Add/edit student form
└── test/                                   # Unit tests
```


## 👨‍💻 Author

**Priyanka Kasarkar**
- GitHub: [@Priyankakasarkar](https://github.com/Priyankakasarkar)

## 🙏 Acknowledgments

- Spring Boot documentation
- Bootstrap framework
- MySQL community
- Open source community




---

⭐ **Star this repo** if you found it helpful!
