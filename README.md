# Hotel-Reservation-System
## Overview

The Hotel Reservation System is a Java application designed to handle hotel room reservations. It manages reservations made by guests, allowing them to create, update, and cancel reservations.

## Table of Contents

- [Features](#features)
- [Entities](#entities)
- [Usage](#usage)
- [Installation](#installation)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Features

1. Create new reservations
2. Update reservation dates
3. Cancel reservations
4. List all reservations made by a guest

## Entities

### Guest

- Attributes:
  - Guest ID
  - Name
  - Reservations (OneToMany relationship with Reservation entity)

### Reservation

- Attributes:
  - Reservation ID
  - Check-in Date
  - Check-out Date
  - Guest (ManyToOne relationship with Guest entity)

## Usage

1. Clone the repository.
2. Compile and run the `HotelReservationSystem` class in your Java development environment.

Example:

```bash
javac HotelReservationSystem.java
java HotelReservationSystem



Installation
Clone the repository to your local machine using the following command:
Git clone  https://github.com/pavans63/Hotel-Reservation-System.git

Dependencies
The Hotel Reservation System has no external dependencies.

Contributing
If you'd like to contribute to the project, please follow the guidelines in CONTRIBUTING.md.

License
This project is licensed under the MIT License - see the LICENSE file for details.

