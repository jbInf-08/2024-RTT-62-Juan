package org.example;

public class TrucksOfAsphalt {
    public static void main(String[] args) {
        // write code here to call and test your method before you submit for grading

    }

    // write your required method here below
    public static int truckloadsOfAsphalt(double miles, int lanes, int inches) {
        double roadLength = miles * 5280;
        int roadWidth = lanes * 12;
        double roadDepth = inches / 12.0;
        double asphaltCubicFeet = roadLength * roadWidth * roadDepth;
        double asphaltPounds = asphaltCubicFeet * 150;
        double approximateTruckLoads = asphaltPounds / 10000;
        int totalTruckLoads = (int)Math.ceil(approximateTruckLoads);

        return totalTruckLoads;
    }

}