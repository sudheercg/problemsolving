package com.codegnan.numbers;

/*
 * QUESTION:
 * Write a Java program to find the sum of digits of a given number.
 *
 * Example:
 * Input  : 1234
 * Output : The sum of digits 1234 is 10
 *
 * Input  : 505
 * Output : The sum of digits 505 is 10
 */

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num; // store original number for output

        int sum = 0; // stores sum of digits

        // Extract digits one by one and add to sum
        while (num != 0) {
            int lastDigit = num % 10; // get last digit
            sum = sum + lastDigit;    // add digit to sum
            num = num / 10;           // remove last digit
        }

        // Display result
        System.out.println("The sum of digits " + original + " is " + sum);

        sc.close(); // good practice
    }
}