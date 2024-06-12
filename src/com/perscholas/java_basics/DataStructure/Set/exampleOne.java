package com.perscholas.java_basics.DataStructure.Set;

import java.util.HashSet;
public class exampleOne {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);
        System.out.println("HashCode (sum) = " + evenNumber.hashCode());

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
        System.out.println("HashCode (sum) = " + numbers.hashCode());
    }
}
