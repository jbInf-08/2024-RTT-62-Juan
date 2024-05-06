package org.example;

import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // declare and initialize variables
        int num_1;
        int num_2;
        double num_3;
        String noun;
        String verb;
        String proper_name;
        String adjective1;
        String adjective2;


        // prompt for and collect inputs

        num_1 = scnr.nextInt();

        num_2 = scnr.nextInt();

        num_3 = scnr.nextDouble();
        scnr.nextLine();
        noun = scnr.nextLine();

        proper_name = scnr.nextLine();

        verb = scnr.nextLine();

        adjective1 = scnr.nextLine();

        adjective2 = scnr.nextLine();


        // output reqired results
        System.out.printf("One day, %d %s(s) wanted to cross a bridge over a river. Under that bridge lived a(n) %s Troll weighing %.2f pounds, with %d eyes and %s hair, named %s. %s said to the %s(s) \"%s away, or I will have to eat you!\".\n", num_1, noun, adjective1, num_3, num_2, adjective2, proper_name, proper_name, noun, verb);


    }
}