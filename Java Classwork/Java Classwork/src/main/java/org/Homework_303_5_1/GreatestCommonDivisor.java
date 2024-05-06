package org.Homework_303_5_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.print("Enter the first positive integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        // Find the minimum of n1 and n2
        int min = Math.min(n1, n2);

        // Initialize gcd variable to 1
        int gcd = 1;

        // Find the greatest common divisor
        for (int k = 2; k <= min; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        // Display the result
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + gcd + ".");

        scanner.close();
    }
}
