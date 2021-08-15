package com.zimenina.yuliya.simple_operation;

/**
 * @author Yuliya Zimenina
 **/
/*
Generate 2 numbers. The first is in the range from 1 to 31,
the second is from 1 to 12.
Tell the user if the generated day and month are not correct
date and display them (for example: "Date: February 30th is not valid.")
If the date is valid, display it on the screen in the "April 4th" format.
 */

public class DateAndMonth {
    public static void main(String[] args) {
        //Date generation.
        int date = 1 + (int) (Math.random() * 31);
        //Generation of the ordinal day of the month.
        int month = 1 + (int) (Math.random() * 12);

        // To determine the validity of the generated day of the month,
        // use the conditional operator if-else-if
        if (date <= 31 && month == 1) {
            System.out.println("Date: " + date + " January");
        } else if (date <= 29 && month == 2) {
            System.out.println("Date: " + date + " February");
        } else if (date <= 31 && month == 3) {
            System.out.println("Date: " + date + " March");
        } else if (date <= 30 && month == 4) {
            System.out.println("Date: " + date + " April");
        } else if (date <= 31 && month == 5) {
            System.out.println("Date: " + date + " May");
        } else if (date <= 30 && month == 6) {
            System.out.println("Date: " + date + " June");
        } else if (date <= 31 && month == 7) {
            System.out.println("Date: " + date + " July");
        } else if (date <= 31 && month == 8) {
            System.out.println("Date: " + date + " August");
        } else if (date <= 30 && month == 9) {
            System.out.println("Date: " + date + " September");
        } else if (date <= 31 && month == 10) {
            System.out.println("Date: " + date + " October");
        } else if (date <= 30 && month == 11) {
            System.out.println("Date: " + date + " November");
        } else if (date <= 31 && month == 12) {
            System.out.println("Date: " + date + " December");

            //The condition under which the received date is not valid
        } else {
            System.out.println("Date: " + date + month + " No such date exists!!!");
        }
    }
}
