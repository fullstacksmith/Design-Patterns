# Factory Method Design Pattern in Java with Spring Boot

![Java](https://img.shields.io/badge/Java-17+-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0+-green)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
    - [Exercise 1: Document Factory](#exercise-1-document-factory)
    - [Exercise 2: Notification Factory](#exercise-2-notification-factory)
    - [Exercise 3: Vehicle Factory with Parameters](#exercise-3-vehicle-factory-with-parameters)
- [Contributions](#contributions)
- [License](#license)
- [Contact](#contact)

## Description

This repository contains a series of practical exercises that implement the **Factory Method Design Pattern** using **Java** and **Spring Boot**. Each exercise addresses a different scenario to demonstrate the flexibility and effectiveness of the pattern in object creation, maintaining clean, extensible, and easy-to-maintain code.

## Features

- **Factory Method Pattern**: Detailed implementation with clear examples.
- **Spring Boot**: Utilizes the Spring Framework to manage dependencies and create REST APIs.
- **Practical Exercises**: Three exercises covering different applications of the pattern.
- **Comprehensive Documentation**: Step-by-step instructions for each exercise.

## Technologies Used

- **Java 17+**
- **Spring Boot 2.7.0+**
- **Maven**: Dependency management and project build.
- **JUnit**: Unit testing.
- **Git**: Version control.

## Installation

Follow these steps to clone and set up the project on your local machine.

### Prerequisites

- **Java Development Kit (JDK)**: Version 17 or higher.
- **Maven**: For dependency management and project build.
- **Git**: To clone the repository.

### Steps

1. **Clone the Repository**

   git clone https://github.com/your-username/factory-method-spring-boot.git

markdown
Copiar código

2. **Navigate to the Project Directory**

cd factory-method-spring-boot

markdown
Copiar código

3. **Build the Project with Maven**

mvn clean install

markdown
Copiar código

4. **Run the Application**

mvn spring-boot


The application will be available at `http://localhost:8080`.

## Usage

### Exercise 1: Document Factory

**Description**: Implement a system for creating documents of different types, such as `Word`, `PDF`, and `Text`, using the Factory Method pattern.

#### Endpoints

- **Open Document**

GET /documents/open/{type}

markdown
Copiar código

**Parameters**:

- `type`: Type of document to open (`word`, `pdf`, `text`).

**Examples**:

- `GET http://localhost:8080/documents/open/word`
- `GET http://localhost:8080/documents/open/pdf`
- `GET http://localhost:8080/documents/open/text`

**Response**:

```json
"Word document opened successfully."
```

**Execution**

1. Send a GET Request to one of the above endpoints using a tool like Postman, cURL, or your web browser.

**Example with cURL:**

```bash
curl -X GET http://localhost:8080/documents/open/word
```

2. Verify the Response in the client and in the application console.

**Console Output:**

```mathematica
Opening Word document.
```

**Client Response:**

```json
"Word document opened successfully."
```

### Exercise 2: Notification Factory
**Description**: Design a system that can send different types of notifications, such as Email, SMS, and Push, using the Factory Method pattern.

**Endpoints**

- Send Notification

```bash
POST /notifications/send/{type}?message={message}
```

**Parameters:**

- type: Type of notification to send (email, sms, push).
- message: Message to send.

**Examples:*

- POST http://localhost:8080/notifications/send/email?message=Hello+World
- POST http://localhost:8080/notifications/send/sms?message=Hello+SMS
- POST http://localhost:8080/notifications/send/push?message=Hello+Push

**Response:**

```json
"Email notification sent successfully."
```

**Execution**

1. Send a POST Request with the notification type and desired message.

**Example with cURL:**

```perl
curl -X POST "http://localhost:8080/notifications/send/email?message=Hello%20World"
```

2. Verify the Response in the client and in the application console.

**Console Output:**

```csharp
Sending Email with message: Hello World
```

**Client Response:**

```json
"Email notification sent successfully."
```

### Exercise 3: Vehicle Factory with Parameters
**Description**: Create vehicles that can have different colors or capacities using the Factory Method pattern with parameters.

**Endpoints**
- Create Vehicle

```bash
GET /vehicles/create/{type}?color={color}&capacity={capacity}
```

**Parameters:**

- type: Type of vehicle to create (car, motorcycle, truck).
- color: Color of the vehicle.
- capacity: Capacity of the vehicle (number of people or tons).

**Examples:**

- GET http://localhost:8080/vehicles/create/car?color=Red&capacity=5
- GET http://localhost:8080/vehicles/create/motorcycle?color=Blue&capacity=2
- GET http://localhost:8080/vehicles/create/truck?color=Green&capacity=10

**Response:**

```json
"Car of type created successfully."
```

**Execution**

1. Send a GET Request with the vehicle type, color, and capacity.

Example with cURL:

```sql
curl -X GET "http://localhost:8080/vehicles/create/car?color=Red&capacity=5"
```

2. Verify the Response in the client and in the application console.

**Console Output:**

```yaml
 "Car - Color: Red, Capacity: 5 people."
```

**Client Response:**

```json
"Car created successfully."
```

## Contributions
Contributions are welcome! If you would like to improve this project, please follow these steps:

- Fork this repository.
- Create a Branch (git checkout -b feature/new-feature).
- Make Your Changes and Commit them (git commit -m 'Add new feature').
- Push to the Branch (git push origin feature/new-feature).
- Open a Pull Request.


## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contact
- Name: **Nestor Ismael Aguilar Estrada**
- Email: [aguilar:2001@hotmail.com](mailto:aguilar:2001@hotmail.com) 
- Web: https://fullstacksmith.github.io/
- LinkedIn: https://www.linkedin.com/in/nismaelaguilar/
- GitHub: https://github.com/fullstacksmith