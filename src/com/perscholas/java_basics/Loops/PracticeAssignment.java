package com.perscholas.java_basics.Loops;

import java.util.*;

public class PracticeAssignment {
    public static void main(String[] args) {
        multiplicationTable();
        greatestCommonDivisor();
        futureTuition();
    }

    // Write a program to print a multiplication table 12x12
    static void multiplicationTable() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + " "); }
            System.out.println(); }
    }

    // Find the Greatest Common Divisor
    static void greatestCommonDivisor() {
        Scanner input = new Scanner(System.in); // Getting the input numbers
        System.out.println("\nEnter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        int gcd = 1; // Greatest Common Divisor - initializing...
        // Checking which number is bigger
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;}
        // Start looking for GCD from the smallest number
        for (int i = n2; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }

    static void futureTuition(){
        Scanner input = new Scanner(System.in); // Getting the input numbers
        System.out.println("\nWrite your tuition: ");
        int tuition = input.nextInt();
        double tuitionGrow = tuition;
        double tuitionDouble = tuition * 2;
        int years = 1;
        while (tuitionGrow <= tuitionDouble) {
            tuitionGrow = tuitionGrow * 1.07;
            years++;
        }
        System.out.println("Your tuition will be doubled in " + years + " years");
    }
}
