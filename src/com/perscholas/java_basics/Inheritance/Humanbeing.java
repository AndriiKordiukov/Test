package com.perscholas.java_basics.Inheritance;

public class Humanbeing extends livingThing {
    public void display() {
        System.out.println("My name is " + name);
    }
    // overriding the eat() method
    //@Override // this is optional
    static public void eat() {
        System.out.println("I enjoy eating Pizza with soft drink");
    }

    // Declaring new method in subclass
    public void communication() {
        System.out.println("I can communicate by language");
    }
}
