# Housing Loan Calculation Application - Technical Documentation

This document outlines the technical details of the Housing Loan Calculation Application.

## Overview

The Housing Loan Calculation Application is a Java console-based program that calculates the cost of a housing 
loan based on user-provided inputs such as the loan amount and payback time. The application utilizes a series 
loan principle, where the user pays back an equal amount each month, which includes both principal and interest.

## Usage

To run the application, execute the `LoanCalculator` class.
The application will prompt the user to provide the desired loan amount and payback time in years. 
The program then calculates the monthly payment and generates a payment plan displaying the breakdown 
of each monthly payment.

## Structure

- `LoanCalculator.java`: The main class responsible for user interaction and input. 
    It prompts the user for loan details and coordinates the loan calculation and payment schedule generation.

- `LoanType.java`: An interface that defines the contract for different loan types.
    Each loan type implements the `getInterestRate()` method to return the corresponding interest rate.

- `HousingLoan.java` and `CarLoan.java`: Concrete implementations of the `LoanType` interface representing 
    different loan types with their associated interest rates.

- `LoanCalculationService.java`: A class responsible for the actual loan calculation logic. 
    It takes a `LoanType` instance, loan amount, and payback time as input and calculates the monthly 
    payment and payment schedule.

## Calculation Formula

The monthly payment is calculated using the formula for an amortizing loan:

M = P * (r * (1 + r)^n) / ((1 + r)^n - 1)

Where:
- `M` is the monthly payment
- `P` is the principal loan amount
- `r` is the monthly interest rate (annual interest rate divided by 12)
- `n` is the total number of payments (loan term in months)

## User Interface

The application provides a simple console-based user interface for input and output. 
It prompts the user for loan details and displays the calculated monthly payment and payment schedule.

## Future Enhancements

The application can be extended to cover additional loan types (e.g., car loan, spending loan) by creating 
new classes that implement the `LoanType` interface and provide different interest rates. 
The `LoanCalculationService` can be easily reused for these new loan types.

## Conclusion

The Housing Loan Calculation Application demonstrates a basic implementation of loan calculation using Java. 
It currently runs on console-based user interface but it could further be improved with a web based form.
