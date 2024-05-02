package org.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc1.nextInt();
        System.out.println("The number is: " + number);

        boolean isTrue = (sc1 instanceof Scanner);
    }
}
