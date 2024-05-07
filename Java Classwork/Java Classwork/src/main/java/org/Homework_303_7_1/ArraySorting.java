package org.Homework_303_7_1;
import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        // Given int array
        int[] numbers = {4, 2, 9, 13, 1, 0};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print the smallest and largest elements
        System.out.println("The smallest number is " + numbers[0]);
        System.out.println("The biggest number is " + numbers[numbers.length - 1]);
    }
}
