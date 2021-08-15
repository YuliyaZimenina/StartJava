package com.zimenina.yuliya.simple_operation;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
The last digit was subtracted from the three-digit number x.
When the result is divided by 10,
and the last digit of the number x was assigned to the quotient
on the left, then we got 237.
Find the number x and display it.
 */

public class FindTheNumber {
    public static void main(String[] args) {
        int y = 237;
        //Search for a given number x
        int x = (y % 100) * 10 + (y / 100);
        System.out.println("The following three-digit number was given: " + x);
    }
}
