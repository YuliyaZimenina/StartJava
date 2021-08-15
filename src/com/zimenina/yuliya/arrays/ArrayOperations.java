package com.zimenina.yuliya.arrays;

import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
1. Create a 6 element array of numbers.
2. Fill the array
3. Swap the first and last element of an array
4. Swap the second and fourth element of an array
5. Increase all elements of the array twice
6. Multiply all elements of the array by the last element

 */

public class ArrayOperations {
    public static void main(String[] args) {
        //Array initialization
        int [] numbers = {93, 11, 4, 21, 15, 87};

        //Outputting an array to the console
        System.out.println("Array:");
        System.out.println(Arrays.toString(numbers) +"\n");

        //Swap the first and last element of an array
        int firstElement = numbers[0];
        numbers [0] = numbers [5];
        numbers[5] = firstElement;
        System.out.println("Modified array 1:");
        System.out.println(Arrays.toString(numbers) + "\n");

        //Swap the second and fourth element of an array
        int secondElement = numbers [1];
        numbers [1] = numbers[2];
        numbers [2] = secondElement;
        System.out.println("Modified array 2:");
        System.out.println(Arrays.toString(numbers) + "\n");

        //Increase all elements of the array twice
        //Using a loop "for"
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        System.out.println("Modified array 3:");
        System.out.println(Arrays.toString(numbers)+ "\n");

        //Multiply all elements of the array by the last element
        //Using a loop "for"
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= numbers.length - 1;
        }
        System.out.println("Modified array 4:");
        System.out.println(Arrays.toString(numbers)+ "\n");
    }
}
