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

git clo![login](https://github.com/user-attachments/assets/7ae86dd2-1079-45ec-94a0-f28cdd198f4f)
ne https://github.com/your-username/employee-management-webapp.git
cd employee-management-webapp

📸 Screenshots



![Uploading login.png…]()


![register](https://github.com/user-attachments/assets/56aa9087-c486-4c09-8b8c-a4916a896d40)



🔒 Security
Passwords are encrypted using BCrypt

All user authentication is handled by Spring Security

Access control via form-based login



👨‍💻 Author
Ankit Choudhary


🙌 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.
