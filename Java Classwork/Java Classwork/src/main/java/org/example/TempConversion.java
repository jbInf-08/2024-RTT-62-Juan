package org.example;

// import the Scanner from the Java standard library
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        double temp, kelvin;

        // Below this comment: collect the requried inputs from the user
        System.out.print("Enter temperature in Fahrenheit : ");

        // Below this comment: compute and store the required output values
        temp = scnr.nextDouble();
        kelvin = (temp - 32) * (5.0/9) + 273.15;

        // Below this comment: disply the required results
        System.out.printf("%.2f degrees Fahrenheit is %.2f Kelvin\n",temp,kelvin);
        scnr.close();
    }
}