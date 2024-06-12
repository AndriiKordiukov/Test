package com.perscholas.java_basics.Inheritance.PA_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Kids User
        KidsUser kidAccount = new KidsUser();
        kidAccount.registerAccount("Timmy", 10);
        kidAccount.registerAccount("Steven", 18);
        System.out.println();
        kidAccount.requestBook("Kids");
        kidAccount.requestBook("Fiction");
        System.out.println("\n");

        // Adult User
        AdultUser adultAccount = new AdultUser();
        adultAccount.registerAccount("Jeremy", 5);
        adultAccount.registerAccount("Leyla", 23);
        System.out.println();
        adultAccount.requestBook("Kids");
        adultAccount.requestBook("Fiction");
    }
}
