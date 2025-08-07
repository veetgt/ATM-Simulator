# Java CLI ATM Simulator

A simple command-line interface (CLI) application that simulates the basic functionalities of an Automated Teller Machine (ATM). This project was developed as a focused exercise to practice and demonstrate core Object-Oriented Programming (OOP) principles in Java.

### Live Demo (GIF)

![GIF of the application running](atm_demo.gif)

---

### Features

- **Check Balance:** View the current account balance.
- **Deposit:** Add funds to the account, with validation for positive amounts.
- **Withdraw:** Withdraw funds, with validation for positive amounts and sufficient balance.
- **Interactive Menu:** A continuous loop that allows the user to perform multiple operations in a single session until they choose to exit.

---

### OOP Concepts Applied

This project was built to solidify the understanding of the following OOP pillars:

- **Classes and Objects:** The `Account` class serves as a blueprint, and an `Account` object is instantiated in the `ATM` class to be manipulated.
- **Encapsulation:** All attributes (`balance`, `accountHolder`, etc.) are `private`, ensuring data integrity. They can only be accessed and modified through public methods like `getBalance()`, `deposit()`, and `withdraw()`.
- **Constructors:** Used to initialize `Account` objects with a valid starting state.
- **Methods:** Define the object's behavior and implement all the business logic (the rules for a valid withdrawal, for example).

---

### Tech Stack

- Java (SE 17+)

---

### How to Run

1.  Clone the repository.
2.  Open the project in a Java IDE (like IntelliJ IDEA).
3.  Run the `main` method in the `ATM.java` class.

---

### Author

**João Vitor Roveda Bontempo**

- **LinkedIn:** `https://www.linkedin.com/in/veetgoodtime/`
- **GitHub:** `https://github.com/veetgt`
