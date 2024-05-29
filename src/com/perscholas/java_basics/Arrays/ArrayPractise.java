package com.perscholas.java_basics.Arrays;

import java.util.*;

public class ArrayPractise {
    public static void main(String[] args) {
        testArray();
        forLoopArray();
        averageArray();
        meanSDArray();
        insertElements();
    }

    static void testArray(){
        int[] age = {12, 4, 5, 2, 5};
        // access each array elements
        Arrays.fill(age, 2, 4, 25);
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
        System.out.println(Arrays.toString(age));
    }

    static void forLoopArray() {
        // create an array
        int[] age = {12, 4, 5};
        // loop through the array using for loop
        System.out.println("Using for Loop:");
        for (int j : age) {
            System.out.println(j);
        }
    }

    static void averageArray() {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        // access all elements using for each loop add each element in sum
        for (int number: numbers) {
            sum += number; }
        // get the total number of elements
        int arrayLength = numbers.length;
        // calculate the average convert the average from int to double
        average = ((double)sum / (double)arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    static void meanSDArray() {
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        // Compute sum and square-sum using loop
        for (int i = 0; i < marks.length; ++i) {
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double)sum / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

        // Print results
        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }

    static void insertElements() {
        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 10 Elements: ");
        for(i=0; i<10; i++)
            arr[i] = scan.nextInt();

        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\nNow the new array is: ");
        for(i=0; i<11; i++)
            System.out.print(arr[i]+ " ");
        scan.close();
    }
}
