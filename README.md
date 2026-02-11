# Binary Calculator Web Application & API
**Course:** SOFE 3980U - Software Quality Assurance  
**Lab:** Lab 2 - Implementing and Testing Web Applications with Spring Boot  

## 🚀 Overview
This project is a Spring Boot web application that provides binary arithmetic services. It features a user-friendly web iBuilnterface and a RESTful API service. The calculator supports binary addition, multiplication, bitwise AND, and bitwise OR operations.

## ✨ Key Features
* **Web Interface:** A responsive UI for performing binary calculations directly in the browser.
* **REST API:** JSON and String-based endpoints for integration with other services.
* **Automated Testing:** Comprehensive JUnit 4 test suite utilizing `MockMvc` for controller testing.
* **Maven Managed:** Project structure and dependencies handled entirely through Apache Maven.

## 🛠️ Technologies Used
* **Java**
* **Spring Boot** (Starter Web & Thymeleaf)
* **Maven** (Build & Dependency Management)
* **JUnit 4** (Unit & Integration Testing)
* **Thymeleaf** (Server-side HTML Templates)

## 🏗️ Installation & Setup
1. **Clone the repository:**
    ```
    git clone https://github.com/Khushi-Patel-code/Lab-2-Web-App-API-with-Maven-Spring-Boot
    ```
2. Build project
   ```
   mvn clean install
   ```
3. Run Application
   ```
   mvn spring-boot:run
   ```
   The app will be available at: ```http://localhost:8080```

## 🧪 Testing
To run the automated test suite, execute:

```
mvn test
```
The project includes tests for:

* **Model logic** in `Binary.java`
* **Web routing and view attributes** in `BinaryController.java`
* **JSON response integrity** in `BinaryAPIController.java`

## 🔌 API Documentation

Endpoints:
* String Result: ```GET /add?operand1=10&operator=*&operand2=11```
* JSON Result: ```GET /add_json?operand1=111&operator=%26&operand2=101```

### **Supported Operators**

| Operator | Function | URL Encoded Value |
| :--- | :--- | :--- |
| `+` | Addition | `+` |
| `*` | Multiplication | `*` |
| `&` | Bitwise AND | `%26` |
| `|` | Bitwise OR | `%7C` |

## 📂 Project Structure

```
├── src
│   ├── main
│   │   ├── java/com/ontariotechu/sofe3980U/
│   │   │   ├── Application.java
│   │   │   ├── Binary.java
│   │   │   ├── BinaryController.java
│   │   │   ├── BinaryAPIController.java
│   │   │   ├── BinaryAPIResult.java
│   │   │   ├── HelloController.java
│   │   │   ├── HelloAPIController.java
│   │   │   └── APIResult.java
│   │   └── resources/templates/
│   │       ├── calculator.html
│   │       ├── result.html
│   │       ├── error.html
│   │       └── hello.html
│   └── test/java/com/ontariotechu/sofe3980U/
│       ├── BinaryControllerTest.java
│       ├── BinaryAPIControllerTest.java
│       ├── HelloControllerTest.java
│       └── HelloAPIControllerTest.java
├── pom.xml
└── README.md
```

## 📸Screenshots
