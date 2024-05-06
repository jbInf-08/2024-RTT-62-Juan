package org.example;

public class PropertiesOfACircle {
    public static void main(String[] args) {
        double pi = 3.1415;
        double radius = 10.25;
        double diameter = (2*radius);
        double circumference = (2*pi*radius);
        double semicircle = (pi*(radius*radius)/2.0);
        double area = (pi*(radius*radius));
        System.out.println("Properties of a Circle");
        System.out.println("Radius             : "  +radius);
        System.out.println("Diameter           : "  +diameter);
        System.out.println("Circumference      : "  +circumference);
        System.out.println("Area               : "  +area);
        System.out.println("Area of Semicircle : " +semicircle);
        System.out.println();
        System.out.println("Properties \"Rounded\" Down");
        System.out.println("Radius             : "  +(int)radius);
        System.out.println("Diameter           : "  +(int)diameter);
        System.out.println("Circumference      : "  +(int)circumference);
        System.out.println("Area               : "  +(int)area);
        System.out.println("Area of Semicircle : " +(int)semicircle);
    }
}

