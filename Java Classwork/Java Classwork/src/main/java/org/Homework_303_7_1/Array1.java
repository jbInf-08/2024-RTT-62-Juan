package org.Homework_303_7_1;

public class Array1 {
    public static void main(String[] args) {
        // Create an array of integers with a length of 3
        int[] numbers = new int[3];

        // Assign values to the array indexes
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // Print out each array element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
