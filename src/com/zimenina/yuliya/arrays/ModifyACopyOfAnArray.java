package com.zimenina.yuliya.arrays;

import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 **/

/*
1. Create an array with 10 elements.
2. Fill it with random numbers ranging from 0 to 20.
3. Create a copy of the first array. Print both arrays to the screen.
4. Increase all elements of the second array by 2 times. Print both arrays to the screen.
(Expected result: only the elements of the second array should be changed)
*/

public class ModifyACopyOfAnArray {
    public static void main(String[] args) {
        //Initializing an array with 10 elements
        int [] originalArray = new int [10];

        //Fill it with random numbers ranging from 0 to 20.
        for (int i = 0; i < originalArray.length; i++) {
            originalArray [i] = (int) (Math.random() * 20);
        }
        System.out.println("\nGenerated original array: "
                + "\t\t" + Arrays.toString(originalArray));

        //Copying the original array
        int [] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("A copy of the original array: "
                + "\t" + Arrays.toString(copyArray) + "\n");

        //Increase the elements of a copy of the original array twice
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] *= 2;
        }

        System.out.println("Original array: \t\t\t\t\t"
                + Arrays.toString(originalArray));
        System.out.println("Modified copy of the original array:"
                + Arrays.toString(copyArray) + "\n");


    }
}
