package org.Slides_303_6;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5};
        //position 0 1 2 3 4
        //value    1 2 3 4 5
        // write code to insert an 9 into the array at position 2
        //step 1: create a new array of size +1
        int[] insert = new int[array.length + 1];
        //step 2: copy the first part of the array before position 2 from the old to the new
        for (int pos = 0; pos < 2; pos++) {
            insert[pos] = array[pos];
        }
        for( int value : insert) {
            System.out.println(value);
        }
    }
}
