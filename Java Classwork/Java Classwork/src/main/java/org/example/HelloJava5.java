package org.example;

import java.util.Scanner;

public class HelloJava5 {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr=new Scanner(System.in);

        // Below this comment: declare any variables you may need
        System.out.print("Enter your text : ");

        // Below this comment: collect the required inputs
        String text = scnr.nextLine();

        // Below this comment: output the correct output
        System.out.print("Java says \"");
        System.out.print(text);
        System.out.println("\"");
    }
}
