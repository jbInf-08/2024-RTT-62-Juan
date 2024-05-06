package org.HackerRank;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();

        // Sum the lengths of s1 and s2
        int sumLengths = s1.length() + s2.length();
        System.out.println(sumLengths);

        // Determine if s1 is lexicographically greater than s2
        String comparisonResult = (s1.compareTo(s2) > 0) ? "Yes" : "No";
        System.out.println(comparisonResult);

        // Capitalize the first letter in s1 and s2
        String capitalizedS1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String capitalizedS2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(capitalizedS1 + " " + capitalizedS2);
    }
}
