package com.perscholas.java_basics.Inheritance;

public class Surgeon extends Doctor {
    private int salary;

    public Surgeon() {
        // base salary for a start position
        salary = 40_000;
    }

    public Surgeon (int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    void Surgeon_Details() {
        System.out.println("Surgeon  Detail...");
        System.out.println(Department = "Cardio");
    }

}
