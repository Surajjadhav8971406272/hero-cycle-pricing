# 🚲 Hero Cycle Pricing Engine

A Spring Boot web application that helps calculate the total price of a Hero Cycle by managing cycle parts, cycle models, and calculating the overall cost based on the selected quantities of parts.

---

## 📖 Project Overview

The Hero Cycle Pricing Engine is designed to simplify cycle price calculation.

The application allows users to:

- Manage Cycle Parts
- Manage Cycle Models
- Calculate the total price of a cycle by selecting a cycle and entering the required quantity for each part.

The application is built using the Spring Boot MVC architecture with Thymeleaf as the frontend and MySQL as the database.

---

## ✨ Features

### 📦 Part Management
- Add Part
- View All Parts
- Update Part
- Delete Part

### 🚲 Cycle Management
- Add Cycle
- View All Cycles
- Update Cycle
- Delete Cycle

### 💰 Pricing Engine
- Select a Cycle
- Enter quantity for each available part
- Calculate total cycle price
- Display price summary with grand total

### ⚠ Exception Handling
- Global Exception Handling using `@ControllerAdvice`
- Custom Resource Not Found Exception
- User-friendly error page

---

## 🛠 Technologies Used

### Backend
- Java 17
- Spring Boot 3.5.16
- Spring MVC
- Spring Data JPA
- Hibernate

### Frontend
- Thymeleaf
- HTML5
- CSS3

### Database
- MySQL

### Build Tool
- Maven

### IDE
- Eclipse IDE

---

## 📂 Project Structure

```
src
│
├── controller
│     HomeController
│     PartController
│     CycleController
│     PricingController
│
├── service
│     PartService
│     CycleService
│     PricingService
│
├── repository
│     PartRepository
│     CycleRepository
│
├── entity
│     Part
│     Cycle
│
├── dto
│     PriceItem
│
├── exception
│     ResourceNotFoundException
│     GlobalExceptionHandler
│
├── templates
│     index.html
│     parts.html
│     add-part.html
│     edit-part.html
│     cycles.html
│     add-cycle.html
│     edit-cycle.html
│     pricing.html
│     price-result.html
│     error.html
│
└── static
      css
         style.css
```

---

## 🗄 Database Tables

### Part

| Column | Type |
|---------|------|
| id | INT |
| name | VARCHAR |
| price | BIGINT |

---

### Cycle

| Column | Type |
|---------|------|
| id | INT |
| name | VARCHAR |

---

## 🧩 Architecture

```
Browser
      │
      ▼
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
MySQL Database
```

---

## 🔄 Application Flow

```
Home

│

├── Manage Parts
│      ├── Add
│      ├── Edit
│      ├── Delete
│      └── View
│
├── Manage Cycles
│      ├── Add
│      ├── Edit
│      ├── Delete
│      └── View
│
└── Pricing Engine
       │
       ▼
Select Cycle
       │
       ▼
Enter Quantity
       │
       ▼
Calculate Price
       │
       ▼
Price Summary
```

---

## 🚀 How to Run

### Clone the Repository

```bash
https://github.com/Surajjadhav8971406272/hero-cycle-pricing.git
```

---

### Open Project

Import the project into Eclipse or IntelliJ as a Maven project.

---

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cycle-price?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### Run Application

Run

```
HeroCyclePricingApplication.java
```

Application starts on

```
http://localhost:8080
```

---

## 📌 Future Enhancements

- User Authentication using Spring Security
- Export Price Summary as PDF
- Search and Filter Parts
- Dashboard with Charts
- REST API Integration
- Responsive Mobile UI

---

## 🎯 Learning Outcomes

This project helped in understanding:

- Spring Boot MVC Architecture
- CRUD Operations
- Spring Data JPA
- Hibernate ORM
- Thymeleaf Integration
- Exception Handling
- Layered Architecture
- MySQL Database Integration
- Maven Project Structure

---

## 👨‍💻 Author

**Suraj Jadhav**

Java Full Stack Developer

GitHub:
https://github.com/Surajjadhav8971406272

---
