package com.codegnan.numbers;

/*
 * QUESTION:
 * Write a Java program to reverse a given number.
 *
 * Example:
 * Input  : 12345
 * Output : 54321
 *
 * Input  : 100
 * Output : 1
 */

import java.util.Scanner;

public class ReverseANumber {

    // Method to reverse a number
    public static int reverse(int n) {

        int rev = 0; // stores reversed number

        // Extract digits and build reversed number
        while (n != 0) {
            int digit = n % 10;      // get last digit
            rev = rev * 10 + digit;  // append digit
            n /= 10;                 // remove last digit
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        // Call reverse method and display result
        System.out.println("Reversed Number: " + reverse(num));

        scan.close(); // good practice
    }
}