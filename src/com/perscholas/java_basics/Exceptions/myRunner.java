package com.perscholas.java_basics.Exceptions;

public class myRunner {
    public static void main(String args[]){
        // TODO Auto-generated method stub
        System.out.println("Welcome to the Registration process");
        Example_Throw st = new Example_Throw();
        try {
            st.checkEligibility(16, 1.6);
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
