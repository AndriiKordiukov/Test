package com.perscholas.java_basics.DataStructure.Map;

import java.util.Comparator;

public  class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String number1, String number2) {

        return number1.compareTo(number2);
    }
}
