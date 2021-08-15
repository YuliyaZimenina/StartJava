package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
Given natural numbers x and y.
Compute the product x and y using only the addition operator.
 */

public class ProductOfNumbers {
    public static void main(String[] args) {
        //Class variables
        int x = 12;
        int y = 6;
        int result = 0;

        //To calculate the result, we use the loop "for"
        for (int i = 0; i < y; i++) {
            result += x;
        }

        System.out.println("Product of numbers x and y is: " + result);

    }
}
