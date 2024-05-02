package org.Homework_303_2_3;

public class RightShift {
    public static void main(String[] args) {
        // Initial value: 150 (binary: 10010110)
        int x = 150;
        System.out.println("Initial decimal value of x: " + x);
        System.out.println("Initial binary string version of x: " + Integer.toBinaryString(x));

        // Right shift by 2
        x = x >> 2; // Predicted decimal value: 37, binary string: 100101
        System.out.println("\nAfter right shift by 2, decimal value of x: " + x);
        System.out.println("Binary string version of x: " + Integer.toBinaryString(x));

        // For value 225
        x = 225;
        System.out.println("\nInitial decimal value of x (225): " + x);
        System.out.println("Initial binary string version of x (225): " + Integer.toBinaryString(x));
        x = x >> 2; // Predicted decimal value: 56, binary string: 11100
        System.out.println("\nAfter right shift by 2, decimal value of x (225): " + x);
        System.out.println("Binary string version of x (225): " + Integer.toBinaryString(x));

        // For value 1555
        x = 1555;
        System.out.println("\nInitial decimal value of x (1555): " + x);
        System.out.println("Initial binary string version of x (1555): " + Integer.toBinaryString(x));
        x = x >> 2; // Predicted decimal value: 388, binary string: 110000100
        System.out.println("\nAfter right shift by 2, decimal value of x (1555): " + x);
        System.out.println("Binary string version of x (1555): " + Integer.toBinaryString(x));

        // For value 32456
        x = 32456;
        System.out.println("\nInitial decimal value of x (32456): " + x);
        System.out.println("Initial binary string version of x (32456): " + Integer.toBinaryString(x));
        x = x >> 2; // Predicted decimal value: 8114, binary string: 111111010101
        System.out.println("\nAfter right shift by 2, decimal value of x (32456): " + x);
        System.out.println("Binary string version of x (32456): " + Integer.toBinaryString(x));
    }
}
