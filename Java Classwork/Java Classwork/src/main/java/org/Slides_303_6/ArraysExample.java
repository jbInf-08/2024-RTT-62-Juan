package org.Slides_303_6;

import java.util.ArrayList;
import java.util.List;


public class ArraysExample {
    public static void main(String[] args) {
        //can create variable and new array line too
        double[] dArray = new double[10];
        //this is also a valid way of creating a new array
        //it is on 2 lines. 1ts creates the variable. 2nd creates the new array in memory
        int[] iArray;
        iArray =  new int[20];
        //this gets uses a bit from time to time
        //the compiler will see this and create an array of strings with size 3 and puts the 3 values in the array
        String[] constants = {"String1, String2", "String3"};
        for (String constant : constants) {
            System.out.println(constant);
        }
        //this is the same as doing
        String[] c1 = new String[3];
        c1[0] = "String1";
        c1[1] = "String2";
        c1[2] = "String3";
        //this also works for other data types
        int[] intConstants = {1, 2, 3, 4, 5};
        for (int pos = 0; pos < intConstants.length; pos++) {
            System.out.println(intConstants[pos]);
        }
        //getting the length of an array is simply using .length
        int x = intConstants.length;
        //Can create an array for a class for an object
        String[] sArray = new String[10];

        String s = new String("New String");
        s.length();
        //this is 99% of what you will use in the future
        List<Double> dList = new ArrayList<Double>();
        dList.size();
    }
}
