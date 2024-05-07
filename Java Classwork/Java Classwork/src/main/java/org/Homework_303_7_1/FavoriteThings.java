package org.Homework_303_7_1;

import java.util.Scanner;

public class FavoriteThings {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many favorite things they have
        System.out.println("How many favorite things do you have?");
        int numFavorites = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a String array of the correct size
        String[] favoriteThings = new String[numFavorites];

        // Ask the user to enter their favorite things and store them in the array
        for (int i = 0; i < numFavorites; i++) {
            System.out.print("Enter your thing: ");
            favoriteThings[i] = scanner.nextLine();
        }

        // Close the scanner
        scanner.close();

        // Print out the contents of the array
        System.out.println("Your favorite things are:");
        for (String thing : favoriteThings) {
            System.out.print(thing + " ");
        }
    }
}