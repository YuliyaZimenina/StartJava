package com.zimenina.yuliya.simple_operation;

/**
 * @author Yuliya Zimenina
 **/

/*
Create a program to display randomly
generated three-digit natural number and its
largest digit. (Use Math or Random class)
 */

public class GenerationARandomNumber {
    public static void main(String[] args) {
        //Generating a random 3-digit number
        int randomNumber = 100 + (int) (Math.random() * (999 - 100) +1);

        //Find the first digit of a three-digit number
        int firstNumber = randomNumber / 100;
        //Find the second digit of a three-digit number
        int secondNumber = randomNumber % 100 / 10;
        //Find the third digit of a three-digit number
        int thirdNumber = randomNumber % 10;
        //Finding the maximum digit of the three received digits
        int max = (Math.max(Math.max(firstNumber,secondNumber), thirdNumber));
        //print the result to the console
        System.out.println("Randomly generated number: " + randomNumber);
        System.out.println("Maximum three-digit digit of a three-digit number: " + max);
    }
}
