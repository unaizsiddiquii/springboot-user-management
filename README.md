# User Management System

## Overview
This is a simple User Management System built with Spring Boot, showcasing CRUD operations on User entities with validation, custom exception handling, and MySQL database integration. The project uses RESTful APIs and integrates Swagger UI for API documentation and testing.

## Postman Testing
```bash
https://web.postman.co/workspace/My-Workspace~1fdef72a-8640-44ef-83e2-17e6555fb1a9/collection/24764318-86a7d897-3e6b-40fd-bd26-e71bc7c8fdc9?action=share&source=copy-link&creator=24764318
```

## Tech Stack
- **Language:** Java 17  
- **Framework:** Spring Boot 3.5.4  
- **Database:** MySQL  
- **ORM:** Spring Data JPA (Hibernate)  
- **Validation:** Spring Boot Starter Validation  
- **API Documentation:** Springdoc OpenAPI (Swagger UI)  
- **Build Tool:** Maven  
- **Other Libraries:** Lombok, MapStruct  

---

## Features
- Create, Read, Update, Delete (CRUD) operations for User entities  
- Input validation using annotations like `@NotBlank`, `@Email`, `@Size`  
- Custom exception handling (e.g., UserNotFoundException)  
- Find user by email functionality  
- Swagger UI integration for interactive API testing  
- Proper layering with Controller-Service-Repository pattern  
- MySQL database connection and schema initialization  
- Detailed API responses with proper HTTP status codes  

---

## Getting Started

### Prerequisites
- Java 17 JDK installed  
- Maven installed  
- MySQL server running and database created (`usermanagementDB`)  
- IDE like IntelliJ IDEA or VS Code (optional but recommended)  

### Setup
1. Clone the repository  
   ```bash
   git clone (https://github.com/unaizsiddiquii/springboot-user-management.git)
   cd usermanagement
