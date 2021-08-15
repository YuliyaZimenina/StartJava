package com.zimenina.yuliya.loops_and_operators;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
Display a series of Fibonacci numbers, consisting of "n" elements.
Fibonacci numbers, are elements of a numerical sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
 */

public class FibonacciNumbers {
    public static void main(String[] args) {
        //Class variables
        int firstNumberFibonacci = 0;
        int secondNumberFibonacci = 1;
        int thirdNumberFibonacci;
        int n; // amount of Fibonacci numbers

        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of Fibonacci numbers to be displayed:");
        n = scanner.nextInt();
        System.out.println("A sequence of " + n + " Fibonacci numbers will be displayed\n");


        //Console output of the first two Fibonacci numbers
        System.out.print(firstNumberFibonacci + ", " + secondNumberFibonacci + ", ");
        //Using a loop "for"
        for (int i = 0; i < n; i++) {
            thirdNumberFibonacci = firstNumberFibonacci + secondNumberFibonacci;

            System.out.print(thirdNumberFibonacci + ", ");
            firstNumberFibonacci = secondNumberFibonacci;
            secondNumberFibonacci = thirdNumberFibonacci;
        }
        scanner.close();
    }
}
