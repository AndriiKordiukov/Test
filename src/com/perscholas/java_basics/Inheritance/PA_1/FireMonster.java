package com.perscholas.java_basics.Inheritance.PA_1;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Fireball ------>";
    }

    @Override
    public String toString() {
        return "Fire Monster " + this.name + " attacking you " + super.toString();
    }
}
