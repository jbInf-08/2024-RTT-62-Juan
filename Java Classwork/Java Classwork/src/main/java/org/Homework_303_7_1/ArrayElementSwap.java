package org.Homework_303_7_1;

public class ArrayElementSwap {
    public static void main(String[] args) {
        // Create a String array of 5 elements
        String[] myArray = {"A", "B", "C", "D", "E"};

        // Print the original array
        System.out.println("Original array:");
        printArray(myArray);

        // Swap the first element with the middle element
        int middleIndex = myArray.length / 2;
        String temp = myArray[0];
        myArray[0] = myArray[middleIndex];
        myArray[middleIndex] = temp;

        // Print the array after swapping
        System.out.println("\nArray after swapping:");
        printArray(myArray);
    }

    // Method to print the elements of the array
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
