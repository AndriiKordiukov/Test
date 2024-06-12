package com.perscholas.java_basics.DataStructure.Generic;

public class Main {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data

        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        mobj.setValueTwo(3141592);
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        mobj2.setValueTwo("!!!");
        System.out.println(mobj2.getValueTwo());
    }
}
