package org.example;

import java.util.Scanner;
public class PizzaOrder {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        int slicesPerPizza = 8;

        // Below this comment: collect the required user inputs
        System.out.print("Enter total number of people : ");
        int numberOfPeople = scnr.nextInt();
        System.out.print("Enter the number of slices each person  will get : ");
        int slicesPerPerson = scnr.nextInt();


        // Below this comment: compute the number of pizzas to order and store the value in a variable
        int numberOfPizzas = (int) Math.ceil((1.0 * numberOfPeople * slicesPerPerson) / slicesPerPizza);


        // Below this comment: write a Java code to display the number of pizzas to order
        System.out.println("Number of pizzas to order : " + numberOfPizzas);

    }
}
