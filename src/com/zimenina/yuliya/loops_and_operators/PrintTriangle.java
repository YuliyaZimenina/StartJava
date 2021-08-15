package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
Print a triangle in the console using the symbol *
 */

public class PrintTriangle {
    public static void main(String[] args) {
        //Using a nested loop "for" and loop "for"
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("  *  ");
            }
            System.out.println(" ");
        }
    }
}
