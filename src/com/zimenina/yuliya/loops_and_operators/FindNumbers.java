package com.zimenina.yuliya.loops_and_operators;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
To find:
The sum of all numbers from 100 to 500;
The sum of all integers from "a" to 500
(the value of "a" is entered from the keyboard a <= 500);
The sum of all even numbers from "a" to "b"
(the value of "a" and b is entered from the keyboard b> = a);
The arithmetic mean of all integers from "a" to "b"
 (the value of "a" and b is entered from the keyboard b> = 100);
 */

public class FindNumbers {
    public static void main(String[] args) {

        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);

        // Find the sum of all numbers from 100 to 500;
        System.out.println("\t\t\tFIND THE SUM OF ALL NUMBERS FROM 100 TO 500\n");
        int sumAllNumbers = 0;
        for (int i = 100; i < 500; i++) {
            sumAllNumbers += i;
        }
        System.out.println("The sum of all numbers from 100 to 500 is: " + sumAllNumbers + "\n");

        //Find the sum of all integers from "a" to 500
        System.out.println("\t\t\tFIND THE SUM ALL INTEGERS FROM \"a\" TO 500\n");
        int a;
        int firstResult = 0;   // The sum of all integers from "a" to 500
        System.out.println("Please enter a value for the number \"a\": ");
        a = scanner.nextInt();
        System.out.println("The value of the number \"a\" is: " + a);
        //Using a loop "for"
        for (; a <= 500; a++) {
            firstResult += a;
        }
        System.out.println("The sum of all numbers from \"a\" to 500 is: " + firstResult + "\n");

        //Find the sum of all even numbers from "a" to "b"
        System.out.println("\t\t\tFIND THE SUM ALL EVEN NUMBERS " +
                "FROM \"a\" TO \"b\"\n");
        int b;
        int secondResult = 0; //  The sum of all even numbers from "a" to "b"
        System.out.println("Please enter a value for the number \"a\": ");
        a = scanner.nextInt();
        System.out.println("The value of the number \"a\" is: " + a);
        System.out.println("Please enter a value for the number \"b\" >= a: ");
        b = scanner.nextInt();
        System.out.println("The value of the number \"b\" is: " + b);
        //Using a loop "for"
        for (; a <= b; a++) {
            if (a % 2 == 0) {
                secondResult += a;
            }
        }
        System.out.println("The sum of all even numbers from \"a\" to \"b\" is: " + secondResult + "\n");

        //Find the arithmetic mean of all integers from "a" to "b"
        System.out.println("\t\t\tFIND THE ARITHMETIC MEAN OF ALL INTEGERS" +
                " FROM \"a\" to \"b\"\n");
        int thirdResult = 0; //   The arithmetic mean of all integers from "a" to "b"
        int count = 0;
        System.out.println("Please enter a value for the number \"a\": ");
        a = scanner.nextInt();
        System.out.println("Please enter a value for the number \"b\" >= 100: ");
        b = scanner.nextInt();
        //Using a loop "for"
        for (int i = a; i <= b; i++) {
            if (b >= 100) {
                thirdResult += i;
                count++;
            }
        }
        System.out.println("The arithmetic mean of all integers from " +
                "the number \"a\" to the number \"b\" is equal to: " + thirdResult / count);

        //Close the Scanner
        scanner.close();
    }
}
