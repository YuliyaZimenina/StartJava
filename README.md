# Start Java - Training Java Programs

An educational project that implements examples of programs designed for studying Java Core.

## Table of contents

1. [Description](#description)
2. [Technologies](#technologies)
3. [Installation and Running](#installation-and-running)
4. [Author](#author)
5. [Code Example](#code-example)
6. [Screenshots](#screeenshots)

## Description

This repository contains a collection of educational Java programs demonstrating basic concepts
of programming.
The project is divided into several thematic packages with simple console applications.

### Purpose

The project was created as a learning playground for mastering **Java basics** (`JavaCore`):
- arrays
- loops and operators
- simple operations with numbers
- string processing

### Topics and Examples

1. **Arrays** (`com.zimenina.yuliya.arrays`)
- Creating and modifying arrays
- Copying and doubling elements
- Finding positive/negative numbers with indexes
- Summing array elements
- Finding the maximum value and its index
- Reversing arrays
   
2. **Loops and Operators** (`com.zimenina.yuliya.loops_and_operators`)
- Fibonacci numbers
- Sum of ranges (100-500, a-b, even numbers, averages)
- Sequences and repeated outputs
- ASCII triangle printing
- Product of numbers using only addition

3. **Simple Operations** (`com.zimenina.yuliya.simple_operation`)
- Sorting three variables in ascending order
- Calculating mathematical functions
- Circle & square perimeter
- Random date validation
- Checking even/odd numbers
- Random numbers generation and digit analysis
- Operations with two-digit numbers

4. **String** (`com.zimenina.yuliya.string`)
- Calculating average word length in a sentence
- Extracting words starting with vowels and ending with consonants

## Technologies

- **Java SE** (`version 11`)

## Installation and Running

1. Clone the repository:

```bash

git clone https://github.com/YuliyaZimenina/StartJava.git

```

2. Open the project in your favorite IDE (IntelliJ IDEA, Eclipse, etc.) or go to the project folder:
   
```bash

cd StartJava

```

3. Make sure **Java 11** is set as the project SDK.
4. Compile and run any file in your IDE or the command line, for example:
   
```bash

javac com/zimenina/yuliya/arrays/ArrayOperations.java
java com/zimenina/yuliya/arrays/ArrayOperations

```

### Project Structure

```bash

├── com/zimenina/yuliya/
│   ├── arrays/               # Array exercises
│   ├── loops_and_operators/  # Loops and conditions
│   ├── simple_operation/     # Basic math & logic
│   └── string/               # String manipulation
└── README.md

```

## Author
[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## Code Example

```java

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

```

## Screenshots

1. The result of the program **Fibonacci Numbers** (`FibonacciNumbers.java`):

<img src="images/1.%20Fibonacci%20numbers.png" alt="Fibonacci numbers." width="450"/>


2. The result of the program **Print Triangle** (`PrintTriangle.java`):


<img src="images/2.%20Print%20triangle.png" alt="Print triangle." width="450"/>


3. The result of the program **Dollar Rate** (`DollarRate.java`):

<img src="images/3.%20DollarRate.png" alt="Dollar Rate" width="300"/>


4. The result of the program **Sum All Array Elements** (`SumAllArrayElements.java`):

<img src="images/4.%20Sum%20array%20elements.png" alt="Sum All Array Elements" width="450"/>


5. The result of the program **Negative and Positive Arrays Elements** (`NegativeAndPositiveArrayElements`):

<img src="images/4.%20Sum%20array%20elements.png" alt="Negative and Positive Arrays Elements" width="450"/>
