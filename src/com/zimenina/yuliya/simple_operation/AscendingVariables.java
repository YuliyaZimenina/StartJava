package com.zimenina.yuliya.simple_operation;

/**
 * @author Yuliya Zimenina
 **/

/* Create three variables a, b, c, write any not equal values.
Write a program,which will rearrange the numbers in the variables
in such a way so that when they are displayed on the screen,
the sequence of a, b and c turned out to be strictly increasing.
*/

public class AscendingVariables {
    public static void main(String[] args) {
        //Class variables
        int a = 93;
        int b = 87;
        int c = 15;
        //Finding the minimum number of three numbers
        int min = Math.min(Math.min(a,b),c);
        //Finding the maximum number of three numbers
        int max = Math.max(Math.max(a,b),c);
        // Finding the average of three numbers
        int mid = (a + b + c) - min - max;
        System.out.println("Ascending sequence: " + min + ", " + mid + ", " + max);
    }
}
