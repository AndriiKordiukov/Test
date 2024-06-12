package com.perscholas.java_basics.Inheritance.PA_1;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Throwing the rock ------>";
    }

    @Override
    public String toString() {
        return "Stone Monster " + this.name + " attacking you " + super.toString();
    }
}
