package com.perscholas.java_basics.Operators;

public class OperatorsAndNumbers {


    public static void main(String[] args) {
        int x[] = {2, 9, 17, 88};
        unaryShiftLeft(x);
        System.out.println();
        int y[] = {150, 225, 1555, 32456};
        unaryShiftRight(y);
        System.out.println();

        int a,b,c,d; // binary AND - & - and OR - | -
        a = 7;      // 00111
        b = 17;     // 10001
        c = a & b;  // 00001 = 1
        d = a | b;  // 10111 = 23
        System.out.println(c + " and " + d);

        // Incrementation
        int p = 0;
        p = p + 1;
        System.out.print("\n" + p);
        p++;
        System.out.print(" + 1 = " + p);
        ++p;
        System.out.print(" + 1 = " + p);
        p+=1;
        System.out.println(" + 1 = " + p);

        // prefix and postfix i++ and ++i
        int m = 5; int n = 8; int k;
        k = ++m + n;
        System.out.println("\nIncrementation gors first ++m " + k);
        m = 5;
        k = m++ + n;
        System.out.println("Incrementation gors first ++m " + k);

    }

    public static void unaryShiftLeft(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(Integer.toBinaryString(x[i]));
            x[i] = x[i] << 1; // 010 << 1 = 100
            System.out.print(" << "+Integer.toBinaryString(x[i]));
            System.out.println("  - Decimal value:" + Integer.toString(x[i]));
        }
    }

    public static void unaryShiftRight(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(Integer.toBinaryString(y[i]));
            y[i] = y[i] >> 2; // 10010110 >> 2 = 00100101
            System.out.print(" >> "+Integer.toBinaryString(y[i]));
            System.out.println("  - Decimal value:" + Integer.toString(y[i]));
        }
    }









}
