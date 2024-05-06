package org.example;

public class TotStoplights {
    public static void main(String[] args) {
        // write code here to call and test your method before you submit for grading

    }

    // write your required method here below
    public static int numberOfStoplights(double miles, int lanes) {
        int stopLightsPerIntersection = 2 + lanes;
        int numberOfIntersections = (int)miles;
        int totalStopLights = stopLightsPerIntersection * numberOfIntersections;

        return totalStopLights;
    }

}