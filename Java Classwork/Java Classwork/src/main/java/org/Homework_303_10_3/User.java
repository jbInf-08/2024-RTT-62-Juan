package org.Homework_303_10_3;

// KidUser class implementing LibraryUser interface
class KidUser implements LibraryUser {
    // Instance variables
    int age;
    String bookType;

    // Constructor
    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    // Method to register account
    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    // Method to request a book
    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}

// AdultUser class implementing LibraryUser interface
class AdultUser implements LibraryUser {
    // Instance variables
    int age;
    String bookType;

    // Constructor
    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    // Method to register account
    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    // Method to request a book
    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}