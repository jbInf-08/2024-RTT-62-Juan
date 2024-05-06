package org.example;

public class NumOfWaterAndPipes {
    public static void main(String[] args) {
        // write code here to call and test your method before you submit for grading

    }

    // write your required methods here below
    public static int numberOfPowerPipes(double miles) {
        double feet = miles * 5280;
        double approximatePowerPipes = feet / 20.0;
        int totalPowerPipes = (int)Math.ceil(approximatePowerPipes);

        return totalPowerPipes;
    }

    public static int numberOfWaterPipes(double miles) {
        double feet = miles * 5280;
        double approximateWaterPipes = feet / 15.0;
        int totalWaterPipes = (int)Math.ceil(approximateWaterPipes);

        return totalWaterPipes;
    }


}