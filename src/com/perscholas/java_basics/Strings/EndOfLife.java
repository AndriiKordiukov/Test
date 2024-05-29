package com.perscholas.java_basics.Strings;
import java.util.*;

public class EndOfLife {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        int inputNumbers = 1;
        while (input.hasNext()) {
            str1 = input.nextLine();
            System.out.println(inputNumbers + " " + str1);
            inputNumbers++;
        }
        input.close();


    }
}