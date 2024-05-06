package org.example;

public class CrewMembers {
    public static void main(String[] args) {
        // write code here to call and test your method before you submit for grading

    }

    // write your required method here below
    public static int numberOfCrewMembers(double miles, int lanes, int days) {
        int crewMembers = (int)Math.ceil((50 * miles * lanes) / days);

        return crewMembers;
    }

}