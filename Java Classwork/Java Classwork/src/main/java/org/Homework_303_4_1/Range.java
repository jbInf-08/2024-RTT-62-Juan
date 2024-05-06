package org.Homework_303_4_1;

public class Range {
    public static void main(String[] args) {
        int x = 15; // Declare and assign 15 to x

        // Check the value of x using if-else statement
        if (x >= 10 && x <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

        // Change x to 5
        x = 5;

        // Check the value of x after the change
        if (x >= 10 && x <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
