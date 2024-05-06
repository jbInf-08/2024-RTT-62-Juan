package org.Homework_303_4_1;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their filing status
        System.out.println("Choose your filing status:");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");
        System.out.print("Enter the number corresponding to your filing status: ");
        int statusChoice = scanner.nextInt();

        // Prompt the user to enter their taxable income
        System.out.print("Enter your taxable income: ");
        double income = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the tax based on filing status and income
        double tax = 0.0;

        switch (statusChoice) {
            case 1: // Single
                tax = calculateSingleTax(income);
                break;
            case 2: // Married Filing Jointly
                tax = calculateMFJTax(income);
                break;
            case 3: // Married Filing Separately
                tax = calculateMFSTax(income);
                break;
            case 4: // Head of Household
                tax = calculateHoHTax(income);
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
                return;
        }

        // Display the calculated tax
        System.out.println("Your federal income tax is: $" + tax);
    }

    // Method to calculate tax for Single status
    public static double calculateSingleTax(double income) {
        // For demonstration, let's assume some mock tax calculation based on income
        // Tax brackets are based on hypothetical values
        if (income <= 50000) {
            return income * 0.1;
        } else if (income <= 100000) {
            return 5000 + (income - 50000) * 0.15;
        } else {
            return 12500 + (income - 100000) * 0.2;
        }
    }

    // Method to calculate tax for Married Filing Jointly status
    public static double calculateMFJTax(double income) {
        // Similar to the Single status calculation
        // Mock tax calculation based on hypothetical values
        if (income <= 75000) {
            return income * 0.1;
        } else if (income <= 150000) {
            return 7500 + (income - 75000) * 0.15;
        } else {
            return 18750 + (income - 150000) * 0.2;
        }
    }

    // Method to calculate tax for Married Filing Separately status
    public static double calculateMFSTax(double income) {
        // Similar to the Single status calculation
        // Mock tax calculation based on hypothetical values
        if (income <= 37500) {
            return income * 0.1;
        } else if (income <= 75000) {
            return 3750 + (income - 37500) * 0.15;
        } else {
            return 9375 + (income - 75000) * 0.2;
        }
    }

    // Method to calculate tax for Head of Household status
    public static double calculateHoHTax(double income) {
        // Similar to the Single status calculation
        // Mock tax calculation based on hypothetical values
        if (income <= 62500) {
            return income * 0.1;
        } else if (income <= 125000) {
            return 6250 + (income - 62500) * 0.15;
        } else {
            return 15625 + (income - 125000) * 0.2;
        }
    }
}