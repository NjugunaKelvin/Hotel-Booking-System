# 🏨✨ Hotel Booking System

Welcome to the **Hotel Booking System**! This Java application provides a simple yet functional booking system where users can explore available rooms, make reservations, and manage bookings. Designed as an educational project, it demonstrates core object-oriented programming (OOP) concepts in Java.

## 📋 Table of Contents
- [Features](#-features)
- [Technologies Used](#-technologies-used)
- [Installation](#-installation)
- [Usage](#-usage)
- [Code Structure](#-code-structure)
- [Future Enhancements](#-future-enhancements)
- [Example Walkthrough](#-example-walkthrough)
- [License](#-license)

## 🌟 Features

- 🛏️ **Room Availability**: Check if rooms are available based on user preferences.
- ✍️ **Book a Room**: Reserve rooms with customizable options and dates.
- 🔍 **View Reservations**: View details of all current bookings.
- ❌ **Cancel a Booking**: Update or cancel an existing reservation.

## 🛠️ Technologies Used

- **Java** ☕: Core programming language used.
- **Object-Oriented Design** 🧩: The system is built around OOP principles for modularity and clarity.
- **Command Line Interface** (CLI) 💻: Simple text-based interface for user interaction.

## 🚀 Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/NjugunaKelvin/hotel-booking-system.git
   cd hotel-booking-system
2. **Compile the program**
3. **Run the program**


## 💻 Usage

After launching the program, you’ll see a list of available options:

1. **Check Room Availability** 🛌: Enter dates and room preferences to check availability.
2. **Make a Reservation** 📅: Reserve a room by entering required details.
3. **View Reservations** 📋: List all current reservations with details.
4. **Cancel a Reservation** ❌: Remove an existing reservation by its ID.

Simply follow on-screen prompts to complete each action.

## 🧩 Code Structure

The project is organized with separate classes for each functionality, promoting a clean and modular structure:

- **`Hotel`** 🏨: Manages room inventory, availability, and bookings.
- **`Room`** 🚪: Represents individual rooms with attributes like room type, capacity, and rate.
- **`Reservation`** 🗓️: Holds booking details such as customer info, room ID, and reservation dates.
- **`Customer`** 👤: Stores customer information like name and contact details.

Each class has methods that align with core hotel booking functions, creating a well-organized flow for both developers and users.

## 🌱 Future Enhancements

This project can be expanded with more advanced features, such as:

- **Graphical User Interface (GUI)** 🎨: Replacing the CLI with a Java-based GUI (e.g., JavaFX or Swing) for a more user-friendly experience.
- **Payment Processing** 💳: Adding payment integration for bookings.
- **Database Integration** 🗄️: Connecting to a SQL database to store customer information and booking history permanently.
- **User Authentication** 🔒: Allowing registered users to log in and manage their bookings.

## 🔄 Example Walkthrough

Here’s a sample interaction with the system:

```plaintext
Welcome to the Hotel Booking System!
------------------------------------
1. Check room availability
2. Make a reservation
3. View your reservations
4. Cancel a booking
Please select an option: 1

[User selects 1 to check availability]
Enter check-in date (YYYY-MM-DD): 2024-12-20
Enter check-out date (YYYY-MM-DD): 2024-12-25
Available Rooms:
- Room 101: Single, $80 per night
- Room 102: Double, $120 per night

[User selects a room and proceeds to book]






