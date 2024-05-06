package org.Homework_303_5_1;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // Change the size of the table here

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                // Print the product of i and j with appropriate formatting
                System.out.printf("%4d", i * j);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
