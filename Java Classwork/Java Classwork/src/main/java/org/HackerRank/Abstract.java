package org.HackerRank;

import java.util.Scanner;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    // Implementing the abstract method setTitle
    void setTitle(String s) {
        title = s;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the title of the book from input
        String title = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Create an instance of MyBook
        MyBook myBook = new MyBook();

        // Set the title of the book
        myBook.setTitle(title);

        // Print the title of the book
        System.out.println("The title is: " + myBook.getTitle());
    }
}