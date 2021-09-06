/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
    1. Input Scanner
    2. Ask for first number
    3. Scan for number
    4. Repeat for second number
    5. Make Sum, Difference, Product, Quotient with numbers given
    6. Output results using the variables made
*/

package exercise05;

import java.util.Scanner;

public class Solution05 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the first number? ");
        String firstNumber = in.nextLine();

        System.out.print("What is the second number? ");
        String secondNumber = in.nextLine();

        int firstNum = Integer.parseInt(firstNumber);
        int secondNum = Integer.parseInt(secondNumber);

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum +
                "\n" + firstNumber + " - " + secondNumber + " = " + difference +
                "\n" + firstNumber + " * " + secondNumber +  " = " + product +
                "\n" + firstNumber + " / " + secondNumber + " = " + quotient);
    }

}
