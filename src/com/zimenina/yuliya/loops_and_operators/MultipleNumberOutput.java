package com.zimenina.yuliya.loops_and_operators;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
Write a program for outputting any number:
1. Request any number from the user.
2. Ask the user for the number of times
the number is printed to the console.
3. Print the number to the console
the number of times specified by the user.
 */

public class MultipleNumberOutput {
    public static void main(String[] args) {
        //Class variables
        double userNumber;
        int iter;

        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any number: ");
        userNumber = scanner.nextDouble();
        System.out.println("Please enter the number of times " +
                "the number is printed to the console:");
        iter = scanner.nextInt();
        System.out.println("The number " + userNumber +
                " will be displayed on the console " + iter + " times");

        //The output of a given number of a given number
        // of times is implemented using a loop
        for (int i = 0; i < iter ; i++) {
            System.out.print( userNumber + ", ");
        }

    }
}
