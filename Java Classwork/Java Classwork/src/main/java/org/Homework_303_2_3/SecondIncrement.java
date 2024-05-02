package org.Homework_303_2_3;

public class SecondIncrement {
    public static void main(String[] args) {
        // Declaring and initializing variables
        int x = 5;
        int y = 8;

        // Using prefix increment operator (++)
        int sum = ++x + y;
        System.out.println("Prefix increment operator (++x): " + sum);

        // Changing to postfix increment operator (x++)
        x = 5; // Resetting x to 5
        sum = x++ + y;
        System.out.println("Postfix increment operator (x++): " + sum);
    }
}
