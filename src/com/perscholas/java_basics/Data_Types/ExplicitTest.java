package com.perscholas.java_basics.Data_Types;

public class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
        // explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z; // 127-> -128 -> 1
        System.out.println("z = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou; // lost decimals
        System.out.println("dou = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou; // 323.142 -> 323 -> 323-256=67
        System.out.println("dou = " + dou + " b = " + b);

    }

}
