package org.Homework_303_4_1;

import java.util.Scanner;

public class WeekdayPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");

        // Read the input number from the user
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Use a switch statement to print out the corresponding weekday
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }
}