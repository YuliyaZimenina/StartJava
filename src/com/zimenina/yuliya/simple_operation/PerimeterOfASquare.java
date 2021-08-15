package com.zimenina.yuliya.simple_operation;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*The task:
   Find the perimeter of the square along one side.
   The user enters the length of the side of the
   square from the keyboard
 */

public class PerimeterOfASquare {
    public static void main(String[] args) {
        // The variable to which the value entered by the user is passed
        int a;
        Scanner scanner = new Scanner(System.in); // Java class that allows you to read data from different sources
        System.out.println("Enter the value of side A squared:");
        a = scanner.nextInt();
        System.out.println("The perimeter of the square is: " + a * 4);
        scanner.close(); //Closing the scanner

    }
}
