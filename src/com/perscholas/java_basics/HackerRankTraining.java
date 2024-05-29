package com.perscholas.java_basics;

import java.util.StringJoiner;
import java.util.Set;
import java.util.HashSet;

public class HackerRankTraining {

    public static void main (String[] args) {
        int number = 90998;
        System.out.println(fourthBit(number));
        String abc = "abcabc";
        int del = minDeletions(abc);
        System.out.println(del);
    }

    public static int fourthBit(int number) {
        String binaryNumber = Integer.toBinaryString(number);
        int result = Character.getNumericValue(binaryNumber.charAt(binaryNumber.length()-4));
        return result;
    }


    public static int minDeletions(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        int deletions = 0;
        for (char c : s.toCharArray()) {
            if (!uniqueChars.add(c)) {
                deletions++; }
        }
        return deletions;
    }
}