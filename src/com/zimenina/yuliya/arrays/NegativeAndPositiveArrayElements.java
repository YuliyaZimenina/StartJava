package com.zimenina.yuliya.arrays;

import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
1. Create an array of integers from 10 elements
2. Fill it with random numbers from -20 to 10
3. Print the array to the screen.
4. Print the number of positive numbers and their indices
5. Print the number of negative numbers and their indices
 */

public class NegativeAndPositiveArrayElements {
    public static void main(String[] args) {
        // 1. Create an array of integers from 10 elements
        int[] array = new int[10];
        // 2. Fill it with random numbers from -20 to 10
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20) - 10);
        }
        // 3. Print the array to the screen.
        System.out.println("Generated array: " + Arrays.toString(array) + "\n");
        // 4. Print the number of positive numbers and their indices
        int positiveElementCount = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                positiveElementCount++;
            }
        }
        System.out.println("Amount positive element in array is: " + positiveElementCount);

        int indexPositiveElements;
        int number;
        System.out.print("Indexes of positive array elements: ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                number = array[j];
                indexPositiveElements = j;
                System.out.print(indexPositiveElements + ", ");
            }
        }

        System.out.println(" ");

        // 5. Print the number of negative numbers and their indices
        int negativeElementsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeElementsCount++;
            }
        }
        System.out.println("\nAmount negative elements in array is: " + negativeElementsCount);

        int indexNegativeElement;
        int num;
        System.out.print("Indexes of negative array elements: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                num = array[i];
                indexNegativeElement = i;
                System.out.print(indexNegativeElement + ", ");
            }
        }
    }
}
