package org.Homework_303_2_3;

public class BitwiseAndOperation {
    public static void main(String[] args) {
        // Declare variables x, y, and z
        int x, y, z;

        // Assign values to x and y
        x = 7;
        y = 17;

        // Predicted result of the bitwise AND operation on x and y: 1
        // Explanation: Bitwise AND operation returns 1 only if both bits are 1, else returns 0.
        // Binary representation of x: 0000 0111
        // Binary representation of y: 0001 0001
        // Applying bitwise AND:
        //                            0000 0111
        //                          & 0001 0001
        //                            _________
        //                            0000 0001 (decimal: 1)
        // Therefore, z should be 1.

        // Perform bitwise AND operation and assign the result to z
        z = x & y;

        // Print the result
        System.out.println("Result of bitwise AND operation on x and y: " + z);
    }
}
