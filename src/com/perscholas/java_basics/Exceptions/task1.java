package com.perscholas.java_basics.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = Integer.getInteger(input.nextLine());
        int y = Integer.getInteger(input.nextLine());
        try {
            System.out.println(x/y);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (NullPointerException npe) {
            System.out.println(npe);
        } catch (InputMismatchException ime) {
            System.out.println(ime);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
