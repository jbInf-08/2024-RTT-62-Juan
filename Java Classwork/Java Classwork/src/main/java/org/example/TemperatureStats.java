package org.example;

import java.util.Scanner;
public class TemperatureStats {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // declare and initialize variables
        double temp1;
        double temp2;
        double temp3;
        double temp4;
        double min = -1;
        double max = 0;
        double average;
        double skew;
        double range;
        double sum = 0;

        // prompt for and collent inputs
        System.out.print("Enter first Temperature  : ");
        temp1 = scnr.nextDouble();
        System.out.print("Enter second Temperature : ");
        temp2 = scnr.nextDouble();
        System.out.print("Enter third Temperature  : ");
        temp3 = scnr.nextDouble();
        System.out.print("Enter fourth Temperature : ");
        temp4 = scnr.nextDouble();


        // compute the required information
        average = (temp1 + temp2 + temp3 + temp4) / 4.0;
        min = Math.min(Math.min(temp1,temp2),Math.min(temp3,temp4));
        max = Math.max(Math.max(temp1,temp2),Math.max(temp3,temp4));
        range = max - min;
        skew = ((average - (min + max) / 2) * 100) / range;

        // output the require results
        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Average : " + average);
        System.out.println("Skew    : " + String.format("%.1f", skew) + "%");
        System.out.println("Range   : " + range);
    }
}
