package com.zimenina.yuliya.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
Enter a string from the keyboard. Select all words from the entered line
starting with vowels (e, o, a, u, i or y) and ending with consonants.
Withdraw output the selected words to the console.
 */

public class SamplingWords {
    public static void main(String[] args) {
        //Class variable
        String userString;

        //To enter data from the keyboard, use the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        userString = scanner.nextLine();

        String [] wordArray = userString.split("[\\s,.:!?] +");
        Pattern pattern = Pattern.compile("^[eyuioa].*[qwrtpsdfghjklzxcvbnm]$");
        for (String word:wordArray) {
            Matcher matcher = pattern.matcher(word);
            if(matcher.find()){
                System.out.println(word);
            }
        }

    }
}
