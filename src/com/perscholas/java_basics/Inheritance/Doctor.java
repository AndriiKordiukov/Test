package com.perscholas.java_basics.Inheritance;

public class Doctor {
    String DoctorName;
    String Department;
    private int salary;
    private byte assistanceNumber;

    public Doctor() {
        // base salary for a start position
        salary = 40_000;
        assistanceNumber = 0;
    }

    public Doctor (int salary) {
        this.salary = salary;
    }

    public Doctor (byte assisNum) {
        assistanceNumber = assisNum;
    }

    public Doctor (int salary, byte assistanceNumber) {
        this.salary = salary;
        this.assistanceNumber = assistanceNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public byte getAssistanceNumber() {
        return assistanceNumber;
    }

    public void setAssistanceNumber(byte assNum) {
        assistanceNumber = assNum;
    }
    public void Doctor_Details() {
        System.out.println("Doctor Details...");
    }

    public void Doctor_Name() {}

}
