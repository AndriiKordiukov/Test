package com.perscholas.java_basics.Inheritance;

public class Boy extends Person {
    static double   ageFactor = 1.1;

    public Boy(String aName) {
        name = aName;
    }

    public String talk() {
        return(super.talk() + " ... but I love Java class.");
    }
    public String walk() {
        return("I am now walking");
    }
    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }
}
