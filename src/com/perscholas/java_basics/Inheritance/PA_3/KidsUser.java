package com.perscholas.java_basics.Inheritance.PA_3;

public class KidsUser implements LibraryUser {
    private String name;
    protected int age;
    protected String bookType;

    public void registerAccount(String name, int age) {
        this.age = age;
        if (this.age >= 12)
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        else if (this.age <= 11){
            this.name = name;
            System.out.println("You have successfully registered under a Kids Account");
        }
    }

    public void requestBook(String bookType) {
            this.bookType = bookType;
            if (bookType == "Kids")
                System.out.println("Book issued successfully, please return the book within 10 days");
            else System.out.println("Oops, you are allowed to take only kids books.");
    }
}
