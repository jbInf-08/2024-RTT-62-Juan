package org.Homework_303_7_1;
import java.util.Arrays;
public class ArrayCopy {
    public static void main(String[] args) {
        // Initialize the original array
        String[] colors = {"red", "green", "blue", "yellow"};

        // Print out the array length
        System.out.println("Original array length: " + colors.length);

        // Make a copy of the array using clone()
        String[] copiedColors = colors.clone();

        // Verify the copy using Arrays.toString()
        System.out.println("Copied array: " + Arrays.toString(copiedColors));
    }
}
