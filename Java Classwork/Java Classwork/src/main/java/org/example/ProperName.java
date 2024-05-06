package org.example;

import java.util.Scanner;

public class ProperName {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String properName = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        int indexOfFirstSpace = 0;
        int indexOfLastSpace = 0;
        int totalCharacters = 0;
        char firstInitial = '?';
        char middleInitial = '?';


        System.out.print("Enter a proper name : ");
        properName = scnr.nextLine();


        indexOfFirstSpace = properName.indexOf(" ");
        indexOfLastSpace = properName.lastIndexOf(" ");
        firstName = properName.substring(0,indexOfFirstSpace);
        middleName = properName.substring(indexOfFirstSpace + 1, indexOfLastSpace);
        lastName = properName.substring(indexOfLastSpace + 1);
        totalCharacters = firstName.length() + middleName.length() + lastName.length();
        firstInitial = properName.charAt(0);
        middleInitial = properName.charAt(indexOfFirstSpace + 1);

        System.out.println("Total characters    : " + totalCharacters);
        System.out.println("First name          : " + firstName);
        System.out.println("Middle name         : " + middleName);
        System.out.println("Last name           : " + lastName);
        System.out.println("First initial       : " + firstInitial);
        System.out.println("Middle initial      : " + middleInitial);
        System.out.println("Last name first     : " + lastName + ", " + firstName + " " + middleName);
        System.out.printf("Short form          : %c. %c. %s\n", firstInitial, middleInitial, lastName);
    }
}
