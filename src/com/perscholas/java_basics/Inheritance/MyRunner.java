package com.perscholas.java_basics.Inheritance;

import java.util.Arrays;

public class MyRunner {
    public static void main (String [] args) {
//      StudentService student = new StudentService();
        AbstractStudent student = new StudentService();
        student.setUsername("Mike123");
        student.setPassword("password1234567");
        student.setRollnumber(0024);
        student.displayinformation();
        String[] name = {"Mike", "Gabriel"};
        System.out.println(Arrays.toString(student.getFullName(name)));
    }
}
