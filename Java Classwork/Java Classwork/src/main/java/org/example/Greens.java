package org.example;

import java.util.Scanner;
public class Greens {
    public static void main(String[] args) {
        // you may wish to write some code in this main method
        // to test your areaOfRectangle method.
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = scnr.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = scnr.nextDouble();
        double area = areaOfRectangle(width, height);
        System.out.println("The area of the rectangle:         ");
        System.out.println(area);
    }

    // complete the function definition below
    public static double areaOfRectangle(double width, double height) {
        double area = width * height;

        return area;
    }
}