package org.HackerRank;

import java.util.Scanner;

public class ReadIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integers from stdin and printing them to stdout
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
