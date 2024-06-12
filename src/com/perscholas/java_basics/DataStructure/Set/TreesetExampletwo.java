package com.perscholas.java_basics.DataStructure.Set;

import java.util.TreeSet;
public class TreesetExampletwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(99);
        numbers.add(555);
        numbers.add(16);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        // Using the remove() method
        boolean value1 = numbers.remove(555);
        System.out.println("Is 555 removed? " + value1);
        System.out.println("TreeSet: " + numbers);
        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
        System.out.println("TreeSet: " + numbers);
    }
}