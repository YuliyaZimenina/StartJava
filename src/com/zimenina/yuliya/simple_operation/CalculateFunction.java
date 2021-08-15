package com.zimenina.yuliya.simple_operation;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
The values of the number x and the number a are requested from the user using the Scanner.
Followed by:
1. Calculate the value of the function y = 7x^2 - 3x + 6 for any value of x
2. Calculate the value of the function x = 12a^2 + 7a - 16 for any value of a
 */

public class CalculateFunction {
    public static void main(String[] args) {
        //Class variables
        int a;
        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate the value of the function y, please enter the value of x: ");
        x = scanner.nextInt();

        //Calculating the value of the function y using a class Math and printing the result to the console
        System.out.println("For a given value of x, the function y = " + (7*Math.pow(x,2) - 3*x + 6));
        System.out.println ("To calculate the value of the function x, please enter the value a:");
        a = scanner.nextInt();
        //Calculating the value of the function x using a class Math and printing the result to the console
        System.out.println ("For a given value of a, function x = " + (12*Math.pow(a,2) + 7*a - 16));
        scanner.close();
    }
}
