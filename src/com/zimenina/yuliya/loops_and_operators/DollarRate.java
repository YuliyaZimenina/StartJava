package com.zimenina.yuliya.loops_and_operators;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
Display the table of the US dollar exchange rate: 1, 2, ... 20
in national currency (conventional units) at the current exchange
 rate (the value of the exchange rate is entered from the keyboard)
 */

public class DollarRate {
    public static void main(String[] args) {
        //Class variables
        double rate;

        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the current USD exchange rate.");
        rate = scanner.nextDouble();
        System.out.println("The current USD exchange rate is" + rate + "conventional units\n");
        System.out.println("\t\t\tCONVERSION TABLE OF THE US DOLLAR TO CONVENTIONAL UNITS\n");
        //Using a loop "for"
        for (int i = 1; i < 21; i++) {
            System.out.println("\t\t\t" + i + "\t" + "$ = " + Math.ceil(i * rate) + "\tC.U.");
        }
        scanner.close();
    }
}
