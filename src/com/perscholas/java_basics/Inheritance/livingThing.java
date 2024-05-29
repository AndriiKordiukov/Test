package com.perscholas.java_basics.Inheritance;

public class livingThing {
    // field and method of the parent class
    protected String name;
    static public void eat() {
        System.out.println("I can eat");
    }
    public void display() {
        System.out.println("My name is " + name);
    }
}
