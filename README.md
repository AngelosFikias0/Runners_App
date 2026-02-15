# 🏃 Run Management API (Spring Boot)

> **A robust RESTful microservice built with Spring Boot for tracking athletic performance, featuring automated persistence and H2 database integration.**

The **Run Management API** provides a structured way to log and analyze physical activity. It leverages the power of Spring Framework's ecosystem to provide a scalable, testable, and high-performance backend with full CRUD capabilities.

---

## 📌 Architecture Overview

This application follows the standard **Spring Boot 3-Tier Architecture**, ensuring a clean separation of concerns between web requests and data persistence.



```text
       [ Client (Postman/cURL) ]
                  |
        (JSON / RESTful API)
                  v
       [ REST Controller Layer ]
        (Request Mapping & Validation)
                  |
                  v
       [ Service / Logic Layer ]
        (Business Rules & Calculations)
                  |
                  v
       [ Repository Layer (Spring Data) ]
        (Hibernate / JPA / JDBC)
                  |
                  v
       [ H2 In-Memory Database ]
```

---

## 🚀 Key Features

* **Full CRUD Lifecycle:** Create, Read, Update, and Delete run records with automated JSON serialization.
* **H2 Embedded Database:** Lightweight, zero-configuration database setup for development and testing.
* **Web Console:** Real-time database monitoring via the H2 Web interface.
* **Flexible Persistence:** Easy switching between in-memory volatile storage and local file persistence.
* **Validation:** Ensuring data integrity for distance (miles), timing, and location types.

---

## 🚦 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/api/runs` | Retrieve all recorded runs |
| **GET** | `/api/runs/{id}` | Get specific run details by ID |
| **POST** | `/api/runs` | Register a new run |
| **PUT** | `/api/runs/{id}` | Update existing run data |
| **DELETE** | `/api/runs/{id}` | Remove a run from the log |

### Sample POST Payload
```json
{
  "title": "Evening Trail Run",
  "startedOn": "2024-05-01T18:00:00",
  "completedOn": "2024-05-01T19:30:00",
  "miles": 8,
  "location": "OUTDOOR"
}
```

---

## 🧰 Technical Stack

* **Framework:** Spring Boot 3.x
* **Language:** Java 17+
* **Build Tool:** Maven
* **Database:** H2 (In-memory/File-based)
* **Tools:** Spring Data JPA, Hibernate, Jackson (JSON)

---

## 🛠️ Installation & Setup

### Prerequisites
* **Java 17** or higher
* **Maven 3.8.1** or higher

### 1️⃣ Clone & Build
```bash
git clone [https://github.com/your-username/run-management-api.git](https://github.com/your-username/run-management-api.git)
cd run-management-api
mvn clean install
```

### 2️⃣ Run the Application
```bash
mvn spring-boot:run
```

### 3️⃣ Database Access
View your data in real-time by visiting:
`http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **User:** `sa` (No password)

---

## 📈 Engineering Highlights

* **In-Memory Speed:** Utilizing H2 for rapid prototyping and local testing environments.
* **RESTful Best Practices:** Implementation of appropriate HTTP status codes (201 Created, 204 No Content) and semantic URL structures.
* **Configuration Management:** Using `application.properties` to toggle between temporary and persistent storage modes.

---

## 📄 License
This project is licensed under the **MIT License**.

---
**Developed by Angelos Fikias** *Building efficient, scalable microservices with Spring Boot.*
