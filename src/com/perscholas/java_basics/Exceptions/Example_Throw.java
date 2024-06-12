package com.perscholas.java_basics.Exceptions;

public class Example_Throw {
    //declare exception using throws in the method signature
    public void checkEligibility (int StAge, double StGpa) throws ArithmeticException{
        if(StAge < 18 && StGpa < 2)
            throw new ArithmeticException("Student is not eligible for registration");
        else
            System.out.println("Student is eligible for registration");
    }

}
