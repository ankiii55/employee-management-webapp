# 👨‍💼 Employee Management Web Application

A full-stack **Employee Management System** built using **Spring Boot**, **Spring Security**, **Thymeleaf**, and **MySQL**. It supports **user registration/login**, **CRUD operations** for employees, and **pagination with sorting** — all within a responsive UI styled with Bootstrap 5.

---

## 📌 Features

- 🔐 User Registration & Login (Spring Security)
- 🧾 Employee Create, Read, Update, Delete (CRUD)
- 📊 Pagination & Sorting
- 🎨 Responsive UI using Bootstrap 5
- 🗃️ MySQL Database Integration
- ✅ Secure Password Handling
- ✨ Clean MVC Architecture

---

## 🧰 Tech Stack

| Layer       | Technology                    |
|-------------|-------------------------------|
| Backend     | Java 17, Spring Boot          |
| Security    | Spring Security               |
| View Layer  | Thymeleaf, HTML, Bootstrap 5  |
| Database    | MySQL, Spring Data JPA (Hibernate) |
| Build Tool  | Maven                         |

---

## 🗂 Project Structure

employee-management-webapp/ ├── src/ │ ├── main/ │ │ ├── java/com/ankit/employee_management_webapp/ │ │ │ ├── controller/ │ │ │ ├── dto/ │ │ │ ├── model/ │ │ │ ├── repository/ │ │ │ ├── service/ │ │ │ └── EmployeeManagementWebappApplication.java │ │ └── resources/ │ │ ├── templates/ │ │ │ ├── login.html │ │ │ ├── registration.html │ │ │ ├── index.html │ │ │ ├── new_employee.html │ │ │ └── update_employee.html │ │ ├── static/ │ │ └── application.properties



---

## ⚙️ MySQL Configuration

1. Create a MySQL database:

```sql
CREATE DATABASE employee_management;



# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=root
spring.datasource.password=yourpassword

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Thymeleaf
spring.thymeleaf.cache=false

# Server
server.port=8080

# Clone the Repository
git clone https://github.com/your-username/employee-management-webapp.git
cd employee-management-webapp

# Build and Run
mvn clean install
mvn spring-boot:run

# Access in Browser
http://localhost:8080/login


🔒 Security
Passwords are encrypted using BCrypt

All user authentication is handled by Spring Security

Access control via form-based login



👨‍💻 Author
Ankit Choudhary


🙌 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.
