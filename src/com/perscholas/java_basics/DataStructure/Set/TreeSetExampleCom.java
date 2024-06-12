package com.perscholas.java_basics.DataStructure.Set;

import java.util.TreeSet;
public class TreeSetExampleCom {
    public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Peking");
        cities.add("Moscow");
        cities.add("Sydney");
        cities.add("Washington");
        cities.add("Istanbul");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}
