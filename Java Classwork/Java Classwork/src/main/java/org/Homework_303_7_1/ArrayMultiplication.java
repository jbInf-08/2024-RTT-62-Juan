package org.Homework_303_7_1;

public class ArrayMultiplication {
    public static void main(String[] args) {
        // Create an integer array with a length of 5
        int[] myArray = new int[5];

        // Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2;
        }

        // Print out the contents of the array
        System.out.println("Contents of the array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Index " + i + ": " + myArray[i]);
        }
    }
}
