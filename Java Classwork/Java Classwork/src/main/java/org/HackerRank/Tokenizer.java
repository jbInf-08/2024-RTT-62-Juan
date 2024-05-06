package org.HackerRank;

import java.util.Scanner;

public class Tokenizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();

        // Split the string into tokens using the regex pattern
        String[] tokens = s.split("[ !,?._'@]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
