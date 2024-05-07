package org.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int findMissingInt(int[] arr) {
        int n = arr.length;
        // Check if the array is sorted in ascending or descending order
        boolean isAscending = arr[0] < arr[1];

        // Find the missing number
        int expectedSum = (arr[0] + arr[n - 1]) * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        int missingNum = isAscending ? expectedSum - actualSum : actualSum - expectedSum;

        return missingNum;
    }

    public static int[] consecutiveInsert(int[] arr, int missingNum) {
        // Find the index to insert the missing number
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] < missingNum && missingNum < arr[i + 1]) || (arr[i] > missingNum && missingNum > arr[i + 1])) {
                index = i + 1;
                break;
            }
        }

        // Create a new array with the missing number inserted
        int[] result = new int[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, index);
        result[index] = missingNum;
        System.arraycopy(arr, index, result, index + 1, arr.length - index);

        return result;
    }
    // Checks whether the array is sorted in ascending or descending order.
    private static boolean isAscending(int[] arr) {
        return arr[0] < arr[1];
    }

}

public class FindTheMissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Provide a default output file path if OUTPUT_PATH environment variable is not set
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath == null) {
            outputPath = "output.txt"; // Default output file path
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        int[] input = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int result = Result.findMissingInt(input);
        int[] result2 = Result.consecutiveInsert(input, result);

        bufferedWriter.write(Integer.toString(result));
        bufferedWriter.newLine();
        bufferedWriter.write(Arrays.toString(result2));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}