package org.example;

import java.util.Scanner;
public class TempConversion2 {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        double temp, fahrenheit;

        // Below this comment: collect the requried inputs from the user
        System.out.print("Enter temperature in Kelvin : ");
        temp = scnr.nextDouble();

        // Below this comment: compute and store the required output values
        fahrenheit = (temp - 273.15) * (9 / 5.0) + 32;

        // Below this comment: disply the required results
        System.out.printf("%.2f degrees Kelvin is %.2f degrees Fahrenheit\n",temp,fahrenheit);
        scnr.close();
    }
}