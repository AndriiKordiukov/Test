package com.perscholas.java_basics.Strings;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = removeLeadingNonLetters(s);

        // If empty
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Splitting to words
        String[] words = s.split("[^a-zA-Z]+");

        // Print
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Check if the first chars are letters, when finding letter - cutting non letters
    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}
