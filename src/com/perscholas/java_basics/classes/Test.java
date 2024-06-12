package com.perscholas.java_basics.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10,2,-2,-20, 10));
        int k = -10;
        long count = 0;
        int start = 0;
        int end = 0;
        long currentSum = 0;

        while (end < arr.size()) {
            currentSum += arr.get(end);

            while (currentSum > k) {
                currentSum -= arr.get(start);
                start++;
            }

            if (currentSum == k) {
                count++;
            }
            end++;
        }
        System.out.println(count);
    }
}
