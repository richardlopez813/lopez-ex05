package exercise05;

import java.util.Scanner;

public class Solution05 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the first number? ");
        int firstNumber = in.nextInt();

        System.out.print("What is the second number? ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber +  " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

    }

}
