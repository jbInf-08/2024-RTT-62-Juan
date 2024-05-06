package org.Homework_303_4_1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the score
        System.out.print("Enter the score: ");

        // Read the input score from the user
        int score = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the score is out of range
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else { // Otherwise, determine the letter grade based on the score
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}