package org.Slides_303_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsert2 {
    public static int[] insert(int[] source, int insertPosition, int valueToInsert) {
        // lets write some code to insert a 9 into the array at position 2
        // 1) create a new array of size + 1
        int[] result = new int[source.length + 1];

        // 2) copy the first part of the array (before position 2) from the old to the new
        for (int pos = 0; pos < insertPosition; pos++) {
            result[pos] = source[pos];
        }

        // 3) actually insert the value we want in position 2
        result[insertPosition] = valueToInsert;

        // 4) copy over the rest of the array
        for (int pos = insertPosition; pos < source.length; pos++) {
            result[pos + 1] = source[pos];
        }
        return result;
    }

    public static int[] delete(int[] source, int deletedPosition) {
        if (deletedPosition < 0 || deletedPosition > source.length) {
            System.out.println("Position to delete is invalid");
        }

        // 1) create a new array with size - 1
        int[] response = new int[source.length - 1];

        // 2) copy the first elements upto but not including the deleted position
        for (int pos = 0; pos < deletedPosition; pos++) {
            response[pos] = source[pos];
        }

        // 3) copy the last elements into a pos-1 in the new array
        for (int pos = deletedPosition + 1; pos < source.length; pos++) {
            response[pos - 1] = source[pos];
        }
        return response;
    }

    public static void main(String[] args) {

        // original array
        // pos   01234
        // value 12345



        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        // array after inserting
        // pos   012345
        // value 129345

        //insert 9 into postion 2
        array = insert(array, 2, 9);
        System.out.println(Arrays.toString(array));

        //insert 0 into position 0
        array = insert(array, 0, 0);
        System.out.println(Arrays.toString(array));

        //delete 9
        array = delete(array, 4);
        System.out.println(Arrays.toString(array));
    }

}