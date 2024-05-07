package org.Homework_303_7_1;

public class MixedArray {
    public static void main(String[] args) {
        // Create an array containing an integer, three strings, and a double
        Object[] mixedArray = {5, "Hello", "World", "Java", 3.14};

        // Print the array
        System.out.println("Mixed Array:");
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.println(mixedArray[i]);
        }
    }
}
