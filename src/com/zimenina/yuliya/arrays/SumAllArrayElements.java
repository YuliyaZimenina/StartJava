package com.zimenina.yuliya.arrays;

import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 **/

/*
Create an array of integers with 10 elements.
Memorize it with random numbers
ranging from 10 to 100.
Display the array to the screen.
Print the sum of all elements of the array.
 */

public class SumAllArrayElements {
    public static void main(String[] args) {
        //Creating an array of 10 elements
        int [] numbers = new int [10];
        //Filling an array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = 10 + (int)(Math.random() * 90);
        }
        System.out.println("Generated array: " + Arrays.toString(numbers));

        //The variable to which the sum of all array elements is passed
        int sum = 0;
        //Finding the sum of all array elements
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of all array elements is: " + sum);

    }
}
