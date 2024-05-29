package com.perscholas.java_basics.Data_Types;

import java.text.NumberFormat;

public class CoreJavaVariables {
    /*   Write a program that declares a named constant and uses it in a calculation. Print the result.*/
    static final double SALES_TAX = 6.75;

    public static void main(String[] args) {
        divideBiggerOfTwoDoubles(29.185, 7.6945); /*
        Write a program that declares two double variables, assigns a number to each,
        and divides the larger by the smaller number. Assign the result to a variable.
        Print out the result. Now, cast the result to an integer. Print out the result again. */

        divideIntDouble(5,6);
        /* Write a program that declares two integer variables, x and y, and assigns the number 5 to x
        and the number 6 to y. Declare a variable q and assign y/x to it and print q.
        Now, cast y to a double and assign it to q. Print q again.*/

        String[] products = {"Cappucino","Espresso","Green Tea"};
        double[] prices = {5.85,4.29,3.14};
        int[] quantity = {3,4,2};
        System.out.println("\nThe totalSale value is " + cafeTotalSale(products,prices,quantity));
        /*  Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale
        and complete an “order” for three items of the first product, four items of the second product,
        and two items of the third product. Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places. */
    }

    public static String cafeTotalSale(String[] args, double[] prices,int[] quantities) {
        double totalSale, subtotal = 0;
        for (int i = 0; i < prices.length; i++) {
            double beveragePrice = quantities[i] * prices[i];
            subtotal += beveragePrice;
        }
        totalSale = subtotal * (1+ SALES_TAX/100);
        NumberFormat totalsale = NumberFormat.getCurrencyInstance(); // making object to format totalSale from double to normal value
        String resultPayment = totalsale.format(totalSale); // change to $
        return resultPayment;
    }

    public static void divideIntDouble(int x, int y) {
        double q = y/x;
        System.out.println("\ninteger y/x = "+ q);
        q = (double) y;
        System.out.println("y casted to double = " + q);
    }

    public static void divideBiggerOfTwoDoubles (double x, double y) {
        double z;
        if (x >= y)
            z = x/y;
        else
            z = y/x;
        System.out.println("\ndouble x/y = " + z);
        System.out.println("int x/y = " + (int)z);
    }
}
