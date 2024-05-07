package org.GLAB_303_11_5;

import java.util.TreeSet;
public class TreeSetComparator {
    public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new CitiesComparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}