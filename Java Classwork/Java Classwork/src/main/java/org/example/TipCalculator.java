package org.example;

import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any variables you may need
        double checkAmount = 0;
        double tip1 = 0;
        double tip2 = 0;
        double tip3 = 0;
        double tip4 = 0;
        double tip5 = 0;
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double total4 = 0;
        double total5 = 0;

        // Below this comment: collect the requried inputs from the user
        System.out.print("Enter the check amount : ");
        checkAmount = scnr.nextDouble();

        // Below this comment: compute and store the required output values
        tip1 = 0.10 * checkAmount;
        tip2 = 0.15 * checkAmount;
        tip3 = 0.20 * checkAmount;
        tip4 = 0.25 * checkAmount;
        tip5 = 0.30 * checkAmount;
        total1 = tip1 + checkAmount;
        total2 = tip2 + checkAmount;
        total3 = tip3 + checkAmount;
        total4 = tip4 + checkAmount;
        total5 = tip5 + checkAmount;

        // Below this comment: disply the required results
        System.out.printf("Total with 10%% tip ($%.2f) is $%.2f\n",tip1,total1);
        System.out.printf("Total with 15%% tip ($%.2f) is $%.2f\n",tip2,total2);
        System.out.printf("Total with 20%% tip ($%.2f) is $%.2f\n",tip3,total3);
        System.out.printf("Total with 25%% tip ($%.2f) is $%.2f\n",tip4,total4);
        System.out.printf("Total with 30%% tip ($%.2f) is $%.2f\n",tip5,total5);

    }
}