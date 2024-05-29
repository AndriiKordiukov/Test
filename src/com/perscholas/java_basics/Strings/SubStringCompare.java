package com.perscholas.java_basics.Strings;

public class SubStringCompare {
    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        String s = "welcometojava";
        int k = 3;
        int largSum = 0;
        int smallSum = 0;

        int numSub = s.length()-(k-1);
        String[] substr = new String[numSub];

        for (int i = 0; i < numSub; i++) {
            substr[i] = s.substring(i, i+k);
        }

        for (int i = 0; i < substr.length; i++) {
            System.out.print(substr[i]);
            if (i < substr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int compare;
        smallest = substr[0];
        for (int n = 0; n < numSub; n++) {
            for (int m = n; m < numSub; m++) {
            compare = substr[m].compareTo(smallest);
            if (compare <=0)
                smallest = substr[m];
            }
        }
        largest = substr[0];
        for (int n = 0; n < numSub; n++) {
            for (int m = n; m < numSub; m++) {
                compare = substr[m].compareTo(largest);
                if (compare >=0)
                    largest = substr[m];
            }
        }

        System.out.println(smallest + "\n" + largest);
        //return smallest + "\n" + largest;
    }
}
