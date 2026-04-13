# Chat App - Registration and Login System (Part 1)

## Overview
This is a console-based registration and authentication system for a chat application. Users can create an account with username, password, and South African cell phone number validation, then log in using their credentials.

## Features
- **User Registration** with validation for:
  - Username (must contain underscore, max 5 characters)
  - Password (8+ chars, capital letter, number, special character)
  - Cell phone number (international code +27 or 0027 format)
- **User Login** with authentication
- **Comprehensive error messages** for invalid inputs
- **Unit testing** with JUnit 4

## Technologies Used
- Java 11+
- JUnit 4 for unit testing
- Maven for build automation
- Git/GitHub for version control

## Project Structure
prog_poe_part1/
src/
main/
 java/
prog_poe_part1/
 Main.java # Console application entry point
 UserLogin.java # Core business logic
 test/
java/
prog_poe_part1/
 UserLoginTest.java # Unit tests
 pom.xml # Maven configuration
 README.md # This file


## Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven 3.6+
- Git (optional, for cloning)

### Steps to Run

1. **Clone the repository**
```bash
git clone https://github.com/PreciousTebogoMokgobu/ST10510175_POE_Part1.git
cd chat-app-part1

Usage Guide
Registration Process
Enter your first name
Enter your last name
Enter a username (e.g., te_bo)
Enter a password (e.g., 1357924680@Tpm)
Enter cell phone number (e.g., +27662722126)

Validation Rules
Field	Requirement	Valid Example	Invalid Example
Username	Contains _ and ≤ 5 characters	te_bo
Password	≥8 chars, 1 capital, 1 number, 1 special	1357924680@Tpm
Phone	Starts with +27 or 0027 + 9 digits	+27662722126	

Login Process
Enter your registered username
Enter your registered password
You have 3 attempts before the application closes

Example 

CHAT APP REGISTRATION
Enter first name: Tebogo
Enter last name: Mokgobu
Enter username (must contain '_' and be ≤ 5 chars): te_bo
Enter password (8+ chars, 1 capital, 1 number, 1 special char): 1357924680@Tpm
Enter cell phone number (e.g., +27831234567): +270662722126
Cell phone number successfully added.
✓ Registration complete! Please login.


LOGIN
Enter username: te_bo
Enter password: 1357924680@Tpm
Welcome Tebogo, Mokgobu it is great to see you again.

✓ You have successfully logged into the Chat App!

Author
[TebogoMokgobu]
[ST10510175]
