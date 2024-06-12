package com.perscholas.java_basics.Inheritance;

public class Dentist extends Doctor{
    private int salary;

    public Dentist() {
        // base salary for a start position
        salary = 40_000;
    }

    public Dentist(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void Dentist_Details() {
        System.out.println("Dentist  Detail...");
        System.out.println(Department = "Dental clinic");
    }
}
