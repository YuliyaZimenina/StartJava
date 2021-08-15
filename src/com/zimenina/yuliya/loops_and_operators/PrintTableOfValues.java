package com.zimenina.yuliya.loops_and_operators;

/**
 * @author Yuliya Zimenina
 **/

/*
The task:
One unit of goods costs 24.5 conventional units.
Print a table of prices 2, 3 ... 20 pieces of this product.
 */

public class PrintTableOfValues {
    public static void main(String[] args) {
        //Class variables
        double price = 24.5;
        // To get the result, we use the loop "for"
        for (int i = 1; i < 21; i++) {
            System.out.println("\tQuantity of goods: " + i
                    + "\tPrice: " + i * price + " \tconventional units");
        }
    }
}
