package org.example;

import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int height = 12;
        int width = 15;


        // collect your input(s)
        System.out.print("Enter wall height : ");
        height = scnr.nextInt();
        System.out.print("Enter wall width : ");
        width = scnr.nextInt();
        System.out.println(); // Gives a blank line
        // compute the required output(s)
        int area = height * width;
        double gallons = area / 350.0;
        int cans = (int)Math.ceil(gallons);

        // display the output(s)
        System.out.println("Wall area : " + area + " square feet ");
        System.out.printf("Paint needed : %.2f gallons\n", gallons);
        System.out.printf("Cans needed : %d can(s)\n", cans);


    }
}

