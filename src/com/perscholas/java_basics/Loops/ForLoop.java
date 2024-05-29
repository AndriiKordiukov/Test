package com.perscholas.java_basics.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        naturalSum();
        isPalindrome();
        pyramid();
    }

    static void naturalSum() {
        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }

    static void isPalindrome() {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
        static void pyramid() {
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();//new line
            }
        }
}