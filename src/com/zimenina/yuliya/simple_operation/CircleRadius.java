package com.zimenina.yuliya.simple_operation;

import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
  Given the radius of a circle, find its diameter
 */

public class CircleRadius {
    public static void main(String[] args) {
        //The variable to which the radius of the circle is passed
        int radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for the radius of the circle:");
        radius = scanner.nextInt();
        System.out.println("The diameter of your circle is: " + radius * 2);
        scanner.close();
    }
}
