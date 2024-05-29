package com.perscholas.java_basics.Data_Types;

public class AutoPromoteTest {
    public static void main(String[] args)
    {
        byte b = 42;
        char c = 'a'; //The letter (a) converted to binary via ASCII is 01100011.
                    // The decimal representation of 01100001 (64 + 32 + 1) is 97
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
        System.out.println("result = " + result);
    }
}
