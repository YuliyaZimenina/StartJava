package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
Given a natural number "n".
Determine the maximum and minimum digit.
 */

public class MaxMinNumber {
    public static void main(String[] args) {
        //Class variables
        int n = 94532343;
        int maxDigit;
        int minDigit;

        maxDigit = minDigit = n % 10;

        //Using a loop "while"
        while (n > 0) {
            int result = n % 10;

            if (result > maxDigit)
                maxDigit = result;

            if (result < minDigit)
                minDigit = result;

            n /= 10;
        }

        System.out.println("Maximum digit in a given number: " + maxDigit);
        System.out.println("Minimum digit in a given number: " + minDigit);
    }
}
