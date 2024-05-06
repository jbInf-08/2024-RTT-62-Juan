package org.example;

import java.util.Scanner;

public class Asphalt {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any variables you may need
        double miles = 0.0;
        int lanes = 0;
        int depthInInches = 0;
        int truckloadsOfAsphalt = 0;
        double cost = 0.0;
        double roadLengthInFeet = 0.0;
        double roadWidthInFeet = 0.0;
        double roadDepthInFeet = 0.0;
        double cubicFeet = 0.0;
        double poundsOfAsphalt = 0.0;
        double tonsOfAsphalt = 0.0;

        // Below this comment: collect the required inputs
        System.out.print("Enter length of road in miles    : ");
        miles = scnr.nextDouble();
        System.out.print("Enter number of lanes            : ");
        lanes = scnr.nextInt();
        System.out.print("Enter depth of asphalt in inches : ");
        depthInInches = scnr.nextInt();

        // Below this comment: write Java code to do the computations needed to determine the correct output
        roadLengthInFeet = miles * 5280;
        roadWidthInFeet = lanes * 12;
        roadDepthInFeet = depthInInches / 12.0;
        cubicFeet = roadLengthInFeet * roadWidthInFeet * roadDepthInFeet;
        poundsOfAsphalt = cubicFeet * 145;
        tonsOfAsphalt = poundsOfAsphalt / 2000;
        truckloadsOfAsphalt = (int)Math.ceil(tonsOfAsphalt / 5);
        cost = truckloadsOfAsphalt * 5 * 150;
        // Below this comment: output the correct output
        System.out.println("Truckloads of asphalt needed is  : " + truckloadsOfAsphalt);
        System.out.printf("Total cost of asphalt is         : $%.2f\n", cost);
    }
}
