package org.Homework_303_5_1;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Initial tuition
        double rate = 0.07; // Annual tuition increase rate
        int years = 0;

        // Loop until the tuition is doubled
        while (tuition < 20000) {
            tuition *= (1 + rate); // Calculate the new tuition for the next year
            years++; // Increment the number of years
        }

        // Print the result
        System.out.println("Tuition will be doubled in " + years + " years.");
    }
}