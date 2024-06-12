package com.perscholas.java_basics.DataStructure.Map;

import java.util.HashMap;

public class ExampleOneHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(7, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        // remove element associated with key 2
        String value = languages.remove(2);
        //String value2 = languages.remove(4, "C Sharp");
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);
    }
}