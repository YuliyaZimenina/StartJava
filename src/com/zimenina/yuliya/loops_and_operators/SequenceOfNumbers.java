package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
 Using the while loop, you need to display
 the following sequence of numbers:
 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 */

public class SequenceOfNumbers {
    public static void main(String[] args) {
        //Class variables
        int i = 7;

        while (i <= 98){
            System.out.print(i + " ");
            i +=7;
        }
    }
}
