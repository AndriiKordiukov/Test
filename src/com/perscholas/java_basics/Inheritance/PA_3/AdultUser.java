package com.perscholas.java_basics.Inheritance.PA_3;

public class AdultUser implements LibraryUser {
    private String name;
    protected int age;
    protected String bookType;

    //@Override
    public void registerAccount(String name, int age) {
        this.age = age;
        if (this.age <= 11)

            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        else if (this.age >= 12) {
            this.name = name;
            System.out.println("You have successfully registered under an Adult Account");
        }
    }

        public void requestBook(String bookType) {
            this.bookType = bookType;
            if (bookType == "Fiction")
                System.out.println("Book issued successfully, please return the book within 7 days");
            else System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
}
