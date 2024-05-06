package org.example;

import java.util.Scanner;
public class PowerAndWater {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // declare and initialize variables
        double miles;
        int numberOfPowerPipes;
        int numberOfWaterPipes;
        double totalCostOfPowerPipes = 0.0;
        double totalCostOfWaterPipes = 0.0;
        double totalCostOfPipesNeeded = 0.0;

        // prompt for and collent inputs
        System.out.print("Enter the number of miles of road : ");
        miles = scnr.nextDouble();


        // compute the required information
        numberOfPowerPipes = (int) Math.ceil((miles * 5280) / 12);
        numberOfWaterPipes = (int) Math.ceil((miles * 5280) / 24);
        totalCostOfPowerPipes = numberOfPowerPipes * 220;
        totalCostOfWaterPipes = numberOfWaterPipes * 415;
        totalCostOfPipesNeeded = totalCostOfPowerPipes + totalCostOfWaterPipes;

        // output the require results
        System.out.println("Number of power pipes needed : " + numberOfPowerPipes);
        System.out.println("Number of water pipes needed : " + numberOfWaterPipes);
        System.out.printf("Cost of power pipes needed   : $%.2f\n", totalCostOfPowerPipes);
        System.out.printf("Cost of water pipes needed   : $%.2f\n", totalCostOfWaterPipes);
        System.out.printf("Total cost of pipes needed   : $%.2f\n", totalCostOfPipesNeeded);

    }
}
