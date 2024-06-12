package com.perscholas.java_basics.Inheritance.PA_1;

public class TestMonster {
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("Fire Lord");   // upcast
        Monster m2 = new WaterMonster("Waternaut");  // upcast
        Monster m3 = new StoneMonster("Rockbeast");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.toString());
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.toString());
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.toString());
        System.out.println(m3.attack());  // Run StoneMonster's attack()

        System.out.println();
        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("Stone Giant");  // upcast
        System.out.println(m1.toString());
        System.out.println(m1.attack());  // Run StoneMonster's attack()

        System.out.println();
        // We have a problem here!!!
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.toString());
        System.out.println(m4.attack());  // garbage!!!
    }
}
