package org.Homework_303_2_3;

public class Increment {
    // Method 1: Using the += operator
    public static int incrementWithOperator(int x) {
        x += 1;
        return x;
    }

    // Method 2: Using the ++ unary operator
    public static int incrementWithUnaryOperator(int x) {
        x++;
        return x;
    }

    // Method 3: Using the increment assignment operator ++
    public static int incrementWithAssignmentOperator(int x) {
        return ++x;
    }

    // Main method
    public static void main(String[] args) {
        // Initial value
        int value = 5;

        // Method 1
        System.out.println("Method 1:");
        System.out.println("Initial value: " + value);
        value = incrementWithOperator(value);
        System.out.println("Value after incrementing: " + value);
        value = incrementWithOperator(value);
        System.out.println("Value after incrementing again: " + value);

        // Method 2
        System.out.println("\nMethod 2:");
        System.out.println("Initial value: " + value);
        value = incrementWithUnaryOperator(value);
        System.out.println("Value after incrementing: " + value);
        value = incrementWithUnaryOperator(value);
        System.out.println("Value after incrementing again: " + value);

        // Method 3
        System.out.println("\nMethod 3:");
        System.out.println("Initial value: " + value);
        value = incrementWithAssignmentOperator(value);
        System.out.println("Value after incrementing: " + value);
        value = incrementWithAssignmentOperator(value);
        System.out.println("Value after incrementing again: " + value);
    }
}
