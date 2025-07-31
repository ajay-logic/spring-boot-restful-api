# _Job Application_

## RESTful APIs Project 
Its simple RESTful API project built with Java, Spring Boot, Spring Data JPA, and MySQL.
testing for Postman and documented with Swagger UI for easy interaction.

# Technologies

- **Java 24**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Postman**
- **Swagger UI**
- **IntelliJ IDEA**

# Application Features
- **User,** (or all) can visit available jobs
- can apply that job.
- **Admin,** view all submited applications
- can view specific applicationsByRole
- can post job openings
- can reject submited application.

# Setup
1.**Clone the Repository** 
cmd: git clone https://github.com/ajay-logic/spring-boot-restful-api.git

2.**Data base configration** (I alredy upate application.properties) in 
src/main/resources/application.properties

# Run
Base API URL: http://localhost:8080

- Swagger UI: http://localhost:8080/swagger-ui.html

# API endpoints

## User endpoints
**GET**  http://localhost:8080/availablejob - **view available job openings**

**POST** http://localhost:8080/jobapplication - **apply for job**

## Admin endpoints
**GET**  http://localhost:8080/admin/applications - **view submited application**

**GET**  http://localhost:8080/admin/applications/page - **view submited applications page vise**

**GET**  http://localhost:8080/admin/applications/filter/{jobRole} - **view specific applications by job role**

**POST**  http://localhost:8080/admin/addjob - **post job openings**

**DELETE** http://localhost:8080admin/rejectapplication/{id} - **reject submited application**

# Example Response
**GET**  http://localhost:8080/availablejob - **view available job openings**

{
"jobId": 24,
"jobRole": "Java Developer",
"vacancy": 2,
"candidate":"Fresher"
} with JSON.

# Developer
**Ajay**

GitHub : https://github.com/ajay-logic



