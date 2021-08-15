package com.zimenina.yuliya.arrays;

import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 **/

/*
Create an array of integers with 10 elements.
Fill it with random numbers ranging from 10 to 50.
Display its values on the screen.
 */

public class RandomNumbersInArray {
    public static void main(String[] args) {
        //Create an array of integers with 10 elements.
        int [] randomArray = new int [10];

        //Fill it with random numbers ranging from 10 to 50.
        //Using a loop "for"
        for (int i = 0; i < randomArray.length; i++) {
            randomArray [i] = 10 + (int) (Math.random() * 40);
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
