package com.perscholas.java_basics.Inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
    public static void main(String args[]) {
        Surgeon s = new Surgeon();
        Dentist dan = new Dentist();
        s.Doctor_Details();
        // Surgeon
        s.Surgeon_Details();
        s.setSalary(198_000);
        s.setAssistanceNumber((byte) 4);
        System.out.println("\nSurgeon's salary is: " + s.getSalary() + " and he has " +
                s.getAssistanceNumber() + " assistants");
        // Dentist
        dan.Dentist_Details();
        dan.setSalary(77_000);
        dan.setAssistanceNumber((byte) 1);
        System.out.println("\nDentist's salary is: " + dan.getSalary() + " and he has " +
                dan.getAssistanceNumber() + " assistants");

        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
            Object element = it.next();
            if (element.equals("###"))//Hints: use instanceof operator
                break;
        }
    }
}

