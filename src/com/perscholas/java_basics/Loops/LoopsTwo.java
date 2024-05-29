package com.perscholas.java_basics.Loops;
import java.util.*;
import java.lang.Math;

public class LoopsTwo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("For each query, print the corresponding series on a new line.");
            System.out.println("Each series must be printed in order as a single line of n space-separated integers.");
            int q = scanner.nextInt();
            int a[] = new int[q];
            int b[] = new int[q];
            int n[] = new int[q];
            for (int r = 0; r < q; r++) {
                a[r] = scanner.nextInt();
                b[r] = scanner.nextInt();
                n[r] = scanner.nextInt();
            }
            for (int i = 0; i < q; i++){
                int res = a[i];
                for (int j = 0; j < n[i]; j++){
                    res += (Math.pow(2,j) * b[i]);
                    System.out.print(res + " ");
                } System.out.println();
            } scanner.close();
        }
}
