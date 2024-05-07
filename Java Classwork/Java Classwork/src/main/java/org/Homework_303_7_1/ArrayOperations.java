package org.Homework_303_7_1;

import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create an int array of length 10
        int[] array = new int[10];

        // Initialize the array to random integers
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Generating random integers between 0 and 99
        }

        // Get the smallest integer in the array
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Get the largest integer in the array
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Calculate the average value in the array
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;

        // Print the results
        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Smallest integer: " + smallest);
        System.out.println("Largest integer: " + largest);
        System.out.println("Average value: " + average);
    }
}