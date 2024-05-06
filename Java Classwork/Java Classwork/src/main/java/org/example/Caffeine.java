package org.example;

import java.util.Scanner;

public class Caffeine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg,input; // "double" supports floating-point like 75.5, versus int for integers like 75.

        System.out.print("Enter caffeine amount (in mg) : ");
        caffeineMg = scnr.nextDouble();

        // Below this comment: declare any variables you may need
        input = caffeineMg;

        // Below this comment: compute and store the required output values
        input = caffeineMg / 2;
        System.out.printf("After 6 hours  : %.2f mg\n",input);

        input = input / 2;
        System.out.printf("After 12 hours : %.2f mg\n",input);

        input = input / 2;
        System.out.printf("After 18 hours : %.2f mg\n",input);
        // Below this comment: disply the required results


    }
}