package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
1. Print the multiplication table by the number 7
to the console
1 x 7 = 7
...
...
...
9 x 7 = 63
2. Print to the console the multiplication table for
 the number 9 in reverse order
 9 x 9 = 81
 ...
 ...
 ...
 1 x 9 = 9
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        //Class variable
        int result;
        System.out.println("MULTIPLICATION TABLE (7)");
        //Using a loop "for"
        for (int i = 1; i <= 9 ; i++) {
            result = i * 7;
            System.out.println(i + " x 7 = " + result);
        }

        System.out.println("\nREVERSE ORDER MULTIPLICATION TABLE (9)");
        //Using a loop "for"
        for (int i = 9; i >=1 ; i--) {
            result = i * 9;
            System.out.println(i + " x 9 = " + result);
        }
    }
}
