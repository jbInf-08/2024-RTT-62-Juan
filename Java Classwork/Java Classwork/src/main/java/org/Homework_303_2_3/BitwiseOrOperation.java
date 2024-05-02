package org.Homework_303_2_3;

public class BitwiseOrOperation {
    public static void main(String[] args) {
        // Declare variables x, y, and z
        int x, y, z;

        // Assign values to x and y
        x = 7;
        y = 17;

        // Predicted result of the bitwise OR operation on x and y: 23
        // Explanation: Bitwise OR operation returns 1 if at least one bit is 1, else returns 0.
        // Binary representation of x: 0000 0111
        // Binary representation of y: 0001 0001
        // Applying bitwise OR:
        //                            0000 0111
        //                          | 0001 0001
        //                            _________
        //                            0001 0111 (decimal: 23)
        // Therefore, z should be 23.

        // Perform bitwise OR operation and assign the result to z
        z = x | y;

        // Print the result
        System.out.println("Result of bitwise OR operation on x and y: " + z);
    }
}
