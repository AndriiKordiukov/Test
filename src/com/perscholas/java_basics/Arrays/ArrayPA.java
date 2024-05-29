package com.perscholas.java_basics.Arrays;

import java.util.*;

public class ArrayPA {
    public static void main(String[] args) {
        arrayOfThree(); // creating arr of 3 integers
        int[] findMiddle = {15, 5, 7, 68, 2}; // type an array of integers to find middle
        System.out.println("Given array - " + Arrays.toString(findMiddle));
        System.out.println("middle element is " + middleElement(findMiddle));
        // Making an array of String to clone
        String[] arrString = {"red", "green", "blue", "yellow", "purple", "orange"};
        cloneArray(arrString);

        // swapping elemnts
        String temp = arrString[0];
        arrString[0] = middleElement(arrString);
        arrString[arrString.length/2] = temp;
        System.out.println("\n Swapping the first element with the middle one: " +
                Arrays.toString(arrString));

        // Creating an array of 5 integers by method
        arrayOperations(7,3);

        // Sorting an Array
        int[] unsortedArray = {4, 2, 9, 13, 1};
        System.out.println("\n Unsorted array - " + Arrays.toString(unsortedArray));
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        System.out.println("\n Sorted array - " + Arrays.toString(sortedArray));
        int smallest = sortedArray[0];
        System.out.println("\n Smallest element is " + smallest);
        int largest = sortedArray[sortedArray.length-1];
        System.out.println("\n Largest element is " + largest + "\n");

        // Creating an abstract array
        Object[] arrObject = new Object[5];
        Integer elementZero = 35;
        arrObject[0] = elementZero;
        arrObject[1] = "Dog";
        arrObject[2] = "Cat";
        arrObject[3] = "Mouse";
        arrObject[4] = 99.99;
        // Print elements of the Array
        for (Object obj : arrObject) {
            System.out.println(obj);
        }

        askQuestions();
    }

    static void arrayOfThree(){
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = 27;
        System.out.println(Arrays.toString(arr));
    }

    static int middleElement(int[] arr){
        int middle = arr.length/2;
        return arr[middle];
    }

    static String middleElement(String[] arr){
        int middle = arr.length/2;
        return arr[middle];
    }

    static void cloneArray(String[] arr){
        System.out.println("\nOriginal Array - " + Arrays.toString(arr));
        System.out.println("Our String array length is " + arr.length);
        System.out.println("Copied Array - " + Arrays.toString(arr.clone()));
    }

    static void arrayOperations(int length, int operation){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = i;
        }
        switch(operation){
            case 1: System.out.println("\nPrinting the Array with elements multiplied by 2");
                for(int i = 0; i < length; i++){
                    arr[i] = arr[i] * 2;
                    System.out.println("\nJust print the Array: \n" + Arrays.toString(arr));
                }
                break;
            case 2: System.out.println("\nPrinting the Array without element with index 2");
                for(int i = 0; i < length; i++){
                    if (i != 2)
                        System.out.println(arr[i]);
                }
                break;
            case 3: System.out.println("\nPrinting the Array with elements^2");
                for(int i = 0; i < length; i++){
                    arr[i] = (int) Math.pow(arr[i],2);
                }
                System.out.println("\nJust print the Array: \n" + Arrays.toString(arr));
                break;
            default: System.out.println("\nJust print the Array: \n" + Arrays.toString(arr)); break;
        }

    }

    static void askQuestions(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nHow many favorite things do you have?");
        int numberOfThings = in.nextInt();
        System.out.println("\nPlease write those things you like:");
        String[] listOfThings = new String[numberOfThings];
        for (int i = 0; i < numberOfThings; i++) {
            listOfThings[i] = in.next();
        }
        System.out.println("\nYour favorite things are:");
        for (int i = 0; i < numberOfThings; i++) {
            System.out.print(listOfThings[i]+" ");
        }
    }
}
