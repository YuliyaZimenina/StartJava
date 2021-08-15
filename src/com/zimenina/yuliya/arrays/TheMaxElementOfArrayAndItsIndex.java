package com.zimenina.yuliya.arrays;

import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
1. Create an array of integers with 10 elements.
2. Fill it with random numbers ranging from 0 to 10.
3. Display the array to the screen.
4. Find the largest value and its index.
5. Display the array in reverse order
 */

public class TheMaxElementOfArrayAndItsIndex {
    public static void main(String[] args) {
        //Create an array of integers with 10 elements.
        int [] randomNumbers = new int [10];
        //The variable to which the maximum element
        // of the array is passed
        int maxElement = 0;
        //The variable to which the index of the
        // maximum array element is passed
        int indexMaxElement = 0;

        //Fill it with random numbers ranging from 0 to 10.
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers [i] = (int)(Math.random() * 11);
            //Find the largest value and its index.
            if (maxElement <= randomNumbers[i]){
                maxElement = randomNumbers[i];
                indexMaxElement = i;
            }
        }

        //Display the array in reverse order
        int lengthArray = randomNumbers.length;
        //Variable to fill in the changed value of the array element
        int exchangeElements;
        //// Loop to fill the array with elements in reverse order
        for (int i = 0; i < lengthArray / 2; i++) {
            exchangeElements = randomNumbers[lengthArray - i - 1];
            randomNumbers[i] = exchangeElements;
        }
        System.out.println("Random Array: " + Arrays.toString(randomNumbers));
        System.out.println("The largest value in the array is: " + maxElement);
        System.out.println("The index of the element having the highest value in" +
                " the array: " + indexMaxElement);
        System.out.println("Reverse array: " + Arrays.toString(randomNumbers));
    }
}
