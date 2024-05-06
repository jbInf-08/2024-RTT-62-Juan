package org.example;

import java.util.Scanner;
public class CourseInfo {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);
        // declare and initialize variables
        int startingIndex;
        int endingIndex;
        String subject;
        String courseTitle;
        int courseNumber;
        int sectionNumber;

        // prompt for and collent inputs
        System.out.print("Enter course info : ");
        String rawInput = scnr.nextLine();
        startingIndex = 0;
        endingIndex = rawInput.indexOf(" ");
        subject = rawInput.substring(startingIndex, endingIndex);

        // compute the required information
        startingIndex = endingIndex + 1;
        endingIndex = rawInput.indexOf(" ", startingIndex);
        courseNumber = Integer.parseInt(rawInput.substring(startingIndex, endingIndex));
        startingIndex = endingIndex + 1;
        endingIndex = rawInput.indexOf(" ", startingIndex);
        sectionNumber = Integer.parseInt(rawInput.substring(startingIndex, endingIndex));
        startingIndex = endingIndex + 1;
        courseTitle = rawInput.substring(startingIndex);

        // output the require results
        System.out.println(String.format(                 "\nSubject        : %s\nCourse Number  : %d\nSection Number : %d\nCourse Title   : %s",                 subject, courseNumber, sectionNumber, courseTitle));
    }
}
