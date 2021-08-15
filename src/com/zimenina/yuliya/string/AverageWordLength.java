package com.zimenina.yuliya.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
Calculate the average word length in a sentence entered from the keyboard.
Discard the fractional part in the output.
Example:
For input string "Hello World"
The result will be 5
 */

public class AverageWordLength {
    public static void main(String[] args) {
        // Class variable
        String userString;

        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        userString = scanner.nextLine();

        //Loop to check if the user entered an empty string
        while (userString.isEmpty()) {
            System.out.println("You entered an empty line. Please enter text.");
            Scanner scanner1 = new Scanner(System.in);
            userString = scanner1.nextLine();
            if (userString.isEmpty()) {
                System.out.println("You entered an empty line. Please enter text.");
                Scanner scanner2 = new Scanner(System.in);
                userString = scanner2.nextLine();
            } else {
                break;
            }
        }
        System.out.println("You entered: " + userString);

        //A loop in which the text is broken into words and their length is calculated
        while (userString !=null){
            StringTokenizer stringTokenizer = new StringTokenizer(userString);
            int allLenght = 0;
            int lengthWord = stringTokenizer.countTokens();
            while (stringTokenizer.hasMoreTokens()){
                allLenght += stringTokenizer.nextToken().length();
            }
            int averageLength = allLenght/lengthWord; // calculate the average word length in a sentence
            System.out.println("The average word length in a sentence is " + averageLength);  // result output - average word length in a sentence
            break;
        }
    }
}
