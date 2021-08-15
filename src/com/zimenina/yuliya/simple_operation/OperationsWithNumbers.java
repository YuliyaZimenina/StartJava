package com.zimenina.yuliya.simple_operation;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
A two-digit number is given.
To find:
1. The number of tens in it
2. The number of f digit 1 in it
3. The sum of his digits
4. The product of his numbers
*/

public class OperationsWithNumbers {
    public static void main(String[] args) {
        //The variable to which the entered two-digit number is passed
        int number;
        // Java class that allows you to read data from different sources
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        //Search for units in a number
        //The variable to which the number of digit 1 in the number is passed
        int count = 0;
        //conditional operator
        if (number / 10 == 1) {
            count++;
        } else if (number % 10 == 1) {
            count++;
        } else {

        }

        //Console output of mathematical operations
        System.out.println("The number of tens in the number you entered is:" + number / 10);
        System.out.println("The number of units in the number you entered is:" + count);
        System.out.println("The sum of the digits of the number you entered is:" + (number / 10 + number % 10));
        System.out.println("The product of the digits of the number you entered is:" + (number / 10) * (number % 10));
    }
}
