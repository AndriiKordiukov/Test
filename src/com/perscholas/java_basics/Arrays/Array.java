package com.perscholas.java_basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n]; // Source array size
        System.out.println("Enter the numbers of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt(); // setup elements
        }
        System.out.println(Arrays.toString(arr)); // showing the source array

        System.out.println("Enter the new size of the array: ");
        int newSize = input.nextInt();    // reading next integer
        int[] newArr = new int[newSize]; // new array size

        System.arraycopy(arr, 0, newArr, 0, n); // copying old arr to newArr

        //System.out.println(Arrays.toString(Arrays.copyOf(arr, 5))); // another method

        System.out.println(Arrays.toString(newArr)); // Showing the newArr

        input.close(); // closing the Scanner
    }
}
