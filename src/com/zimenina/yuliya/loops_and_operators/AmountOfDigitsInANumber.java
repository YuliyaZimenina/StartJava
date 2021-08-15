package com.zimenina.yuliya.loops_and_operators;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
Determine the number of digits in the entered number.
 */

public class AmountOfDigitsInANumber {
    public static void main(String[] args) {
        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int userNumber = scanner.nextInt();
        int count = 0;
        // Using a conditional operator
        if(userNumber == 0){
            System.out.println("You entered a one-digit number");
        }else {
            //Using a loop "while"
            while (userNumber != 0) {
                count++;
                userNumber /= 10;
            }
            System.out.println("You entered a "+ count +"-digit number");
        }


    }
}
