package org.Homework_303_7_1;

public class ArrayIndex {
    public static void main(String[] args) {
        // Create an integer array with 5 elements
        int[] myArray = {1, 2, 3, 4, 5};

        // Print out the value at the first index
        System.out.println("Value at index 0: " + myArray[0]);

        // Print out the value at the last index
        System.out.println("Value at last index: " + myArray[myArray.length - 1]);

        // Try printing the value at index equal to the length of the array
        try {
            System.out.println("Value at index equal to length: " + myArray[myArray.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        // Try assigning a value to index 5
        try {
            myArray[5] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
