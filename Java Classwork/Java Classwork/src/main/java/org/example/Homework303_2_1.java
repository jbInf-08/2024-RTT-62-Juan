package org.example;

public class Homework303_2_1 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables
        //assigns an integer to each, and adds them together
        //Assign the sum to a variable. Print out the result
       int num1 = 10;
       int num2 = 20;

       int sum = num1 + num2;
       System.out.println("The sum of num1 and num2 is : " + sum);

        //Write a program that declares two double variables
        //assigns a number to each, and adds them together
        //Assign the sum to a variable. Print out the result
        double d1 = 1.00;
        double d2 = 2.00;

        double dsum = d1 + d2;
        System.out.println("The sum of d1 and d2 is : " + dsum);

        //Write a program that declares an integer variable and a double variable
        //assigns numbers to each, and adds them together
        //Assign the sum to a variable. Print out the result
        int num3 = 25;
        double d3 = 8.56;

        double sum3 = num3 + d3;
        System.out.println("The sum of num3 and d3 is : " + sum3);
        System.out.println("The type of the result variable is: " + Double.valueOf(sum3).getClass().getName());

        //Write a program that declares two integer variables
        //assigns an integer to each, and divides the larger number by the smaller number
        //Assign the result to a variable. Print out the result
        int v1 = 80;
        int v2 = 50;

        double vdiv = (double)v1 / (double)v2;
        System.out.println("The division of v1 and v2 is : " + vdiv);
        //Now change the larger number to a decimal. What happens? What corrections are needed?
        v1 = (int) 80.0;
        vdiv = (double) v1 / (double) v2;
        System.out.println("The division of v1 and v2 is : " + vdiv);

        //Write a program that declares two double variables
        //assigns a number to each, and divides the larger by the smaller number
        //Assign the result to a variable. Print out the result
        double v3 = 9.0;
        double v4 = 2.5;

        double vdiv2 = (double)v4 / (double)v3;
        System.out.println("The division of v4 and v3 is : " + vdiv2);
        //cast the result to an integer. Print out the result again
        int result = (int) vdiv2;
        System.out.println("The result is : " + result);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        //Declare a variable q and assign y/x to it and print q
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("The result is : " + q);

        //cast y to a double and assign it to q. Print q again.
        q = (double) y;
        System.out.println("The result is : " + q);

        //Write a program that declares a named constant and uses it in a calculation
        final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * radius * radius;
        //Print the result
        System.out.println("The area is : " + area);

        //Write a program that represent products at a cafe
        // Product prices
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.00;
        double espressoPrice = 2.00;

        // Order quantities
        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;

        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (espressoPrice * espressoQty);

        // Constants
        final double SALES_TAX = 0.08;

        // Calculate total sale with sales tax
        double totalSale = subtotal * (1 + SALES_TAX);

        // Format results to two decimal places
        String formattedSubtotal = String.format("%.2f", subtotal);
        String formattedTotalSale = String.format("%.2f", totalSale);

        // Print results
        System.out.println("Subtotal: $" + formattedSubtotal);
        System.out.println("Total Sale (including 8% sales tax): $" + formattedTotalSale);
    }
}
