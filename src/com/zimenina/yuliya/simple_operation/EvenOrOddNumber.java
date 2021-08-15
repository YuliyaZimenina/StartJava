package com.zimenina.yuliya.simple_operation;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
We ask the user for a number.
We check:
1. Whether the user-entered integer is even or odd.
2. We display information on the console
 */

public class EvenOrOddNumber {
    public static void main(String[] args) {
        //Class variables
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        number = scanner.nextInt();
        //Determine with the help of a conditional operator what number the user entered
        if (number % 2 == 0) {
            System.out.println("The number you entered is even");
        } else {
            System.out.println("The number you entered is not even");
        }
    }
}
