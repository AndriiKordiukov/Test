package com.perscholas.java_basics.Inheritance;

public class StudentService extends AbstractStudent {
    // Assume this gpa is coming from Database
    private double gpa = 4.2;
    @Override
    public void displayinformation() {
        System.out.println("Welcome to " + this.COLLAGENAME);
        System.out.println("Your username is " + this.username + " and password is " + this.password);
        System.out.println(" Your roll number is "+ this.rollnumber + " and You got  " + this.gpa);
    }

    @Override
    public String[] getFullName(String[] name) {
        // TODO Auto-generated method stub
        String[] fullname = name;
        return fullname;
    }
}
