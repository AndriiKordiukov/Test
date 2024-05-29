package com.perscholas.java_basics.if_and_switch;

import java.util.*;

public class ControlFlow {
    public static void main(String[] args) {
    program1(7);  // less than 10
    program1(15); // between 10 and 20
    program1(25); // greater than 20
    program1(77); // out of range
    // Grading the score
    Scanner input = new Scanner(System.in);
    System.out.println("Write your score:");
    gradeAssessment(input.nextInt());
    // Defining the weekday
    System.out.println("Write the day number: ");
    weekday(input.nextInt());
    // Tax Caclulator with Status check
        System.out.println("\nThis program is willing help you to count your taxes \nbased on your current filling status and annual income!");
        System.out.println("\nLet's check your current filling status (input number):\n" +
                "1 - Single\n" +
                "2 - Married (Filing Jointly or qualified Widow)\n" +
                "3 - Married (Filing Separately)\n" +
                "4 - Head of Household");
        int status = input.nextInt();
        System.out.println("\nNow you can write your annual income (round to $1):");
        int annualIncome = input.nextInt();
        System.out.println("\nNext season you have to pay : $"
                + taxCalculator(status, annualIncome) + " in Taxes");
    }

    public static int taxCalculator(int status, int income) {
        int taxToPay = 0;
        if (status >= 1 && status <= 4 && income >= 0) {
        switch (status) {
            case 1:
                if (income <= 8350)
                    taxToPay = income - (income * 9) / 10;
                else if (income <= 33_950)
                    taxToPay = income - (income * 85) / 100;
                else if (income <= 82_250)
                    taxToPay = income - (income * 75) / 100;
                else if (income <= 171_550)
                    taxToPay = income - (income * 72) / 100;
                else if (income <= 372_950)
                    taxToPay = income - (income * 67) / 100;
                else
                    taxToPay = income - (income * 65) / 100;
                break;
            case 2:
                if (income <= 16_700)
                    taxToPay = income - (income * 9) / 10;
                else if (income <= 67_900)
                    taxToPay = income - (income * 85) / 100;
                else if (income <= 137_050)
                    taxToPay = income - (income * 75) / 100;
                else if (income <= 208_850)
                    taxToPay = income - (income * 72) / 100;
                else if (income <= 372_950)
                    taxToPay = income - (income * 67) / 100;
                else
                    taxToPay = income - (income * 65) / 100;
                break;
            case 3:
                if (income <= 8350)
                    taxToPay = income - (income * 9) / 10;
                else if (income <= 33_950)
                    taxToPay = income - (income * 85) / 100;
                else if (income <= 68_525)
                    taxToPay = income - (income * 75) / 100;
                else if (income <= 104_425)
                    taxToPay = income - (income * 72) / 100;
                else if (income <= 186_475)
                    taxToPay = income - (income * 67) / 100;
                else
                    taxToPay = income - (income * 65) / 100;
                break;
            case 4:
                if (income <= 11_950)
                    taxToPay = income - (income * 9) / 10;
                else if (income <= 45_500)
                    taxToPay = income - (income * 85) / 100;
                else if (income <= 117_450)
                    taxToPay = income - (income * 75) / 100;
                else if (income <= 190_200)
                    taxToPay = income - (income * 72) / 100;
                else if (income <= 372_950)
                    taxToPay = income - (income * 67) / 100;
                else
                    taxToPay = income - (income * 65) / 100;
                break;
        }

        }
        else System.out.println("Wrong input. Try again!");
        return taxToPay;
    }

    public static void program1(int x) {
        if (x <= 10)
            System.out.println("Less than 10");
        else if (x <= 20)
            System.out.println("Between 10 and 20");
        else if (x <= 50)
            System.out.println("Greater than 20");
        else
            System.out.println("Out of range");
    }

    public static void gradeAssessment(int grade) {
        String output;
            if (grade >= 0 && grade <= 100) {
        switch (grade/10) {
            case 10: output = "A"; break;
            case 9: output = "A"; break;
            case 8: output = "B"; break;
            case 7: output = "C"; break;
            case 6: output = "D"; break;
            default: output = "E"; break;
        }
        System.out.println("Your grade is " + output);
            }
            else System.out.println("Score out of range");
        }

    public static void weekday(int day) {
        String whatDay = "";
        if (day >= 1 && day <= 7) {
            switch (day) {
                case 1: whatDay = "Sunday"; break;
                case 2: whatDay = "Monday"; break;
                case 3: whatDay = "Tuesday"; break;
                case 4: whatDay = "Wednesday"; break;
                case 5: whatDay = "Thursday"; break;
                case 6: whatDay = "Friday"; break;
                case 7: whatDay = "Saturday"; break;
            }
            System.out.println("Today is " + whatDay);
        }
        else System.out.println("Out of range");
    }
}
