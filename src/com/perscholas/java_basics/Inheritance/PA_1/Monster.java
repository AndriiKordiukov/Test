package com.perscholas.java_basics.Inheritance.PA_1;

public class Monster {
    protected String name;

    public Monster(String name) {
        this.name = name;
    }
    public String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    @Override
    public String toString() {
        return "Run Away!";
    }
}
