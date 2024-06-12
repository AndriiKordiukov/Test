package com.perscholas.java_basics.DataStructure.Map;

import java.util.TreeMap;
public class maincomparator {

    public static void main(String[] args) {

        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("ZZZ", 1);
        numbers.put("BBB", 2);
        numbers.put("TTT", 3);
        numbers.put("FFF", 4);
        numbers.put("AAA", 5);

        System.out.println("TreeMap: " + numbers);
    }
}
