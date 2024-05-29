package com.perscholas.java_basics.Inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        // create an object of the subclass
        Humanbeing HObj = new Humanbeing();

        // access field of superclass
        HObj.name = "Mr Best";
        HObj.display();

        HObj.eat();
        HObj.communication();

        livingThing lt = new Humanbeing();
        lt.name = "Ms Worst";
        lt.display();
        lt.eat();


    }

}
