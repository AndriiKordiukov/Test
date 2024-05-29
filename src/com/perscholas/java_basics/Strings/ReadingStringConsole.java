package com.perscholas.java_basics.Strings;

import java.util.Scanner;

public class ReadingStringConsole {
    public static void main(String[] args) {
        ReadingStringFromConsole();
        ReadingStringFromConsole2();
    }

        public static void ReadingStringFromConsole() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter three words separated by spaces: ");
            String s1 = input.next();
            String s2 = input.next();
            String s3 = input.next();
            System.out.println("s1 is " + s1);
            System.out.println("s2 is " + s2);
            System.out.println("s3 is " + s3);
        }

        public static void ReadingStringFromConsole2() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a character: ");
            String s = input.nextLine();
            char ch = s.charAt(0);
            System.out.println("The character entered is " + ch);
        }

    }
