package org.example;

public class AreaOfCircle {
    public static void main(String[] args) {
        // you may wish to write some code in this main method
        // to test your method.
    }

    // complete the method definition below
    public static double areaOfCircle(double diameter) {
        double radius = diameter / 2.0;
        double area = Math.PI * (radius * radius);

        return Math.round(area * 100.0) / 100.0;
    }
}
