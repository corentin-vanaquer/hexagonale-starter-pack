# Hexagonal Architecture Example

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.1-brightgreen)
![Build](https://img.shields.io/badge/Build-Passing-success)

## Overview

A production-ready Spring Boot implementation showcasing Hexagonal Architecture (also known as Ports and Adapters pattern). This project demonstrates SOLID principles, clean architecture practices, and enterprise-grade project structuring.

### Why Hexagonal Architecture?

- ✅ Clear separation of concerns
- ✅ Business logic isolation
- ✅ Framework independence
- ✅ Highly testable components
- ✅ Maintainable codebase

## 🏗️ Project Structure

Employing a modular approach with clear boundaries:

hexagonal-architecture/  
├── 🎯 domain/          # Core business logic and entities  
├── 💼 application/     # Use cases and port interfaces  
├── 🔌 infrastructure/  # External adapters and implementations  
├── 📱 web/            # REST APIs and controllers  
└── 🚀 bootstrap/      # Application configuration and startup  

## 🛠️ Technology Stack

| Technology      | Purpose                                          | Version |
|----------------|--------------------------------------------------|---------|
| Java           | Modern, robust programming language              | 17      |
| Spring Boot    | Enterprise-grade application framework           | 3.2.1   |
| Maven          | Dependency management and build automation       | 3.6+    |
| H2 Database    | In-memory database for development              | Latest  |
| Lombok         | Boilerplate code reduction                      | Latest  |
| MapStruct      | Type-safe bean mapping                          | Latest  |
| Spring Data JPA| ORM and data access simplification  
