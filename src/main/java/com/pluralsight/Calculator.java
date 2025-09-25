package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What math operation would you like to do? This is fake! It's all multiplication :)");
        String userOperation = myScanner.nextLine();

        System.out.println("Enter your first number:");
        float firstNumber = myScanner.nextFloat();

        System.out.println("Enter your second number:");
        float secondNumber = myScanner.nextFloat();

        float multiplicationResult = firstNumber * secondNumber;

        System.out.println("Your result of " + firstNumber + " and " + secondNumber + " is: " + multiplicationResult);
    }
}
