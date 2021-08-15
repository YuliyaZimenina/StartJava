package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
Print numbers to the console in the following form:
20 20 20 20 20
20 20 20 20 20
 */

public class NumbersInTwoLine {
    public static void main(String[] args) {
        //Using a loop for
        for (int i = 0; i < 5; i++) {
            System.out.print("20 ");
        }
        System.out.println(" "); //Empty string
        for (int i = 0; i < 5; i++) {
            System.out.print("20 ");
        }
    }
}
