package org.Homework_303_2_3;

public class LeftShift {
    public static void main(String[] args) {
        // Initial value: 2 (binary: 10)
        int x = 2;
        x = x << 1; // Predicted decimal value: 4, binary string: 100
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string version of x: " + Integer.toBinaryString(x));

        // For value 9
        x = 9;
        x = x << 1; // Predicted decimal value: 18, binary string: 10010
        System.out.println("\nDecimal value of x (9): " + x);
        System.out.println("Binary string version of x (9): " + Integer.toBinaryString(x));

        // For value 17
        x = 17;
        x = x << 1; // Predicted decimal value: 34, binary string: 100010
        System.out.println("\nDecimal value of x (17): " + x);
        System.out.println("Binary string version of x (17): " + Integer.toBinaryString(x));

        // For value 88
        x = 88;
        x = x << 1; // Predicted decimal value: 176, binary string: 10110000
        System.out.println("\nDecimal value of x (88): " + x);
        System.out.println("Binary string version of x (88): " + Integer.toBinaryString(x));
    }
}
