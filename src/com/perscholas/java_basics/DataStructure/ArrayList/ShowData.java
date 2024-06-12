package com.perscholas.java_basics.DataStructure.ArrayList;

import java.util.ArrayList;
public class ShowData {
    public static void main(String[] args) {
        // instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist) {
            // ---- invoking getter method for getting Data---------
            System.out.println(showValue.getNumber() + " " +showValue.getName()
                        +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
        }
    }
}