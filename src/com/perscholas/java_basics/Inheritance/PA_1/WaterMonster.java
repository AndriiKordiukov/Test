package com.perscholas.java_basics.Inheritance.PA_1;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Waterball ------>";
    }

    @Override
    public String toString() {
        return "Water Monster " + this.name + " attacking you " + super.toString();
    }
}
