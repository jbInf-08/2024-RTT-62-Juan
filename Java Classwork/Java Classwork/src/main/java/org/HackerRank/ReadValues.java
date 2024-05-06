package org.HackerRank;

import java.util.Scanner;

public class ReadValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer, double, and string from stdin
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
        String stringValue = scanner.nextLine();

        // Print the values according to the specified format
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
