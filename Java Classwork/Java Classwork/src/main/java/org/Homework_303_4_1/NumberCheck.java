package org.Homework_303_4_1;

public class NumberCheck {
    public static void main(String[] args) {
        int x = 15; // Declare and assign 15 to x

        // Check the value of x using if-else-if statements
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        // Change x to 50
        x = 50;
    }
}