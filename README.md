# SpringBoot + Spring MVC + MySQL + Thymeleaf CRUD Operations 🚀

Welcome to the **SpringBoot_SpringMVC_MySql_Thymeleaf_CRUD_Operations** project! This is a simple web application that demonstrates CRUD (Create, Read, Update, Delete) operations using **Spring Boot**, **Spring MVC**, **MySQL**, and **Thymeleaf**. 🌐

---

## 📋 Table of Contents
1. [Project Overview](#-project-overview)
2. [Technologies Used](#-technologies-used)
3. [Features](#-features)
4. [Setup Instructions](#-setup-instructions)
5. [Running the Application](#-running-the-application)
6. [Project Structure](#-project-structure)
7. [Contributing](#-contributing)
8. [License](#-license)

---

## 🚀 Project Overview
This project is a basic web application that allows users to perform CRUD operations on a database using a user-friendly interface. It is built with:
- **Spring Boot** for backend development.
- **Spring MVC** for handling web requests.
- **MySQL** as the database.
- **Thymeleaf** for server-side rendering of HTML templates.

---

## 🛠 Technologies Used
- **Spring Boot** 🍃
- **Spring MVC** 🌐
- **MySQL** 🗄️
- **Thymeleaf** 🖥️
- **Maven** 🛠️
- **Bootstrap** 🎨 (for styling)

---

## ✨ Features
- **Create**: Add new records to the database. ➕
- **Read**: View all records in a table format. 👀
- **Update**: Edit existing records. ✏️
- **Delete**: Remove records from the database. ❌
- **Responsive UI**: Built with Bootstrap for a clean and modern look. 📱💻

---

## 🛠 Setup Instructions

### Prerequisites
- **Java JDK 17** ☕
- **MySQL** 🗄️
- **Maven** 🛠️
- **IDE** (IntelliJ IDEA, Eclipse, or any preferred IDE) 💻

### Steps to Set Up
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/SpringBoot_SpringMVC_MySql_Thymeleaf_CRUD_Operations.git
   cd SpringBoot_SpringMVC_MySql_Thymeleaf_CRUD_Operations
   ```

2. **Set Up MySQL Database**:
   - Create a database named `crud_demo` in MySQL.
   - Update the `application.properties` file with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/crud_demo
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**:
   Open your browser and navigate to:
   ```
   http://localhost:8080
   ```

---

## 🏃 Running the Application
- The application will start on port `8080`.
- Use the web interface to perform CRUD operations on the database.

---

## 📂 Project Structure
```
src/main/java
└── com.example.demo
    ├── controller       # Spring MVC Controllers
    ├── entity           # JPA Entities
    ├── repository       # JPA Repositories
    ├── service          # Service Layer
    └── DemoApplication.java  # Main Application Class

src/main/resources
├── static              # Static files (CSS, JS, etc.)
├── templates           # Thymeleaf HTML templates
└── application.properties  # Configuration file
```

---

## 🤝 Contributing
Contributions are welcome! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

---

## 📜 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy Coding! 😄👨‍💻👩‍💻
