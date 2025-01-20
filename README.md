# Spring Boot User Registration Form with Validation 🚀

![Project Status](https://img.shields.io/badge/Status-Completed-green)

## **Overview**

Welcome to the **Spring Boot User Registration** project! This is a **Spring Boot** web application designed to handle **user registration**, **form validation**, and dynamic feedback. The form leverages **Java Validation Annotations** for input validation and **Thymeleaf** for rendering dynamic HTML content. 🎯

This application uses **Bootstrap 5** for styling, ensuring a modern, responsive, and visually attractive layout. This project is perfect for developers who want to learn about integrating Spring Boot with Thymeleaf and form validation.

## **Key Features** ✨

- **User Registration Form** 📝: A simple and user-friendly form to register users with **username** and **email**.
- **Form Validation** 🛡️: Built-in **validation** for **username**, **email**, and **terms agreement** using **Java Validation API**.
- **Dynamic Feedback** ⚡: Displays error messages and highlights invalid fields when form validation fails.
- **Bootstrap 5 Styling** 💅: A sleek and modern design that is responsive across different screen sizes.
- **Success Page** 🎉: After form submission, a success page is displayed showing the submitted **username** and **email**.

## **Technologies Used** 💻

- **Spring Boot** 🚀: The powerful Java framework for building web applications with minimal setup.
- **Thymeleaf** 🍃: A server-side Java template engine to render dynamic HTML content.
- **Bootstrap 5** 🎨: A responsive front-end framework for mobile-first web development.
- **Java Validation API** 📜: Using annotations like `@NotBlank`, `@Size`, `@Email`, and `@AssertTrue` for user input validation.
- **Maven** 🔧 / **Gradle** ⚙️: Build tools to handle project dependencies and packaging.

## **Project Architecture** 🏗️

This project follows the **MVC (Model-View-Controller)** architecture:

- **Model** 🏢: The `LoginData` class holds user input data and is annotated with validation rules.
- **View** 👀: Thymeleaf templates (`form.html` and `success.html`) handle rendering dynamic content and displaying form data.
- **Controller** 🎮: The `MyController` class processes form submissions and redirects based on validation results.

## **How It Works** 🔄

### **Form Validation** ✅:
- **Username**: Uses `@NotBlank` and `@Size` annotations to ensure the username is non-empty and within the 3-15 character limit.
- **Email**: The `@Email` annotation ensures that the email is in the correct format.
- **Terms Agreement**: The `@AssertTrue` annotation validates that the user agrees to the terms before submitting the form.

### **Thymeleaf Integration** 🔗:
- Form fields are dynamically bound to the model attributes (`loginData.userName`, `loginData.email`).
- Validation errors are handled using **Thymeleaf’s error handling**, and error messages are shown next to invalid fields.

### **Bootstrap 5 Styling** 🌈:
- The form layout is designed using **Bootstrap 5**, ensuring the interface is responsive and visually appealing.
- The `is-invalid` class is applied to fields when validation fails, and feedback is shown in a stylish red color.

## **Installation & Setup** ⚙️

### **Pre-requisites** 🛠️

Before you begin, make sure you have the following tools installed:

- **Java 17** or higher ☕
- **Maven** or **Gradle** 📦
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code) 🖥️
- **Git** for version control 🧑‍💻


