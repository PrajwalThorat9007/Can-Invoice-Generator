
# Cab Invoice Generator (TDD Implementation)

## Project Overview

Cab Invoice Generator is a Maven-based Java application developed using **Test Driven Development (TDD)** and **Git Flow branching strategy**.

The system calculates cab fares based on ride distance, time, ride type, and generates invoice summaries for individual users.

---

## Development Approach

This project was implemented using:

- Test Driven Development (TDD)
- Maven Project Structure
- Git Flow (feature-based development)
- JUnit 5 for testing
- Object-Oriented Design Principles

Each Use Case (UC1 – UC5) was developed in a separate feature branch using the following workflow:

```
git add .
git commit -m "[Prajwal]:UC*:commit statement"
git push origin feature/UC*
git flow feature finish -k UC*
git push origin develop
```

---

## Use Case Implementation

### UC1 – Calculate Fare
- Calculate fare using:
  - Rs.10 per km
  - Rs.1 per minute
  - Minimum fare Rs.5

### UC2 – Multiple Rides
- Accept multiple rides
- Return aggregate total fare

### UC3 – Enhanced Invoice
- Return:
  - Total Number of Rides
  - Total Fare
  - Average Fare Per Ride

### UC4 – Invoice Service
- Given a userId:
  - Fetch rides from RideRepository
  - Generate InvoiceSummary

### UC5 – Premium Ride Support
Supports two ride categories:

| Ride Type | Cost per Km | Cost per Minute | Minimum Fare |
|------------|-------------|----------------|--------------|
| NORMAL     | 10          | 1              | 5            |
| PREMIUM    | 15          | 2              | 20           |

---

## Project Structure

```
src
 ├── main
 │   ├── java
 │   │   ├── CabInvoiceGenerator.java
 │   │   ├── Ride.java
 │   │   ├── RideType.java
 │   │   ├── InvoiceSummary.java
 │   │   ├── RideRepository.java
 │   │   └── InvoiceService.java
 │   └── resources
 │
 └── test
     └── java
         └── CabInvoiceGeneratorTest.java
```

---

## Class Responsibilities

### CabInvoiceGenerator
Contains core fare calculation logic.

### Ride
Represents a cab ride with:
- distance
- time
- rideType

### RideType (Enum)
Defines pricing strategy for:
- NORMAL
- PREMIUM

### InvoiceSummary
Stores:
- totalRides
- totalFare
- averageFare

### RideRepository
Stores rides mapped to userId.

### InvoiceService
Fetches rides for a user and generates invoice summary.

---

## How to Run

### Run Tests

Using Maven:

```
mvn clean test
```

Using IntelliJ:
- Right click on test folder
- Run All Tests

---

## Design Highlights

- Fully TDD driven
- Layered Architecture
- Clean separation of concerns
- Enum-based pricing strategy
- Easily extensible for new ride categories
---
