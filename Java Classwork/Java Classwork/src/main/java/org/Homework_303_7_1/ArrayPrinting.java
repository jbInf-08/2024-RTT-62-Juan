package org.Homework_303_7_1;

public class ArrayPrinting {
    public static void main(String[] args) {
        // Create an array of 5 elements
        int[] myArray = {1, 2, 3, 4, 5};

        // Loop through the array and print the value of each element, except for the middle element
        for (int i = 0; i < myArray.length; i++) {
            if (i != 2) {
                System.out.println("Value at index " + i + ": " + myArray[i]);
            }
        }
    }
}
