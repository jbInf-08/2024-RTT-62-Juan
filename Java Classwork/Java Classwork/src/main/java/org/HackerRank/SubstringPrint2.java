package org.HackerRank;

import java.util.Scanner;

public class SubstringPrint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        System.out.println(s.substring(start, end));
    }
}