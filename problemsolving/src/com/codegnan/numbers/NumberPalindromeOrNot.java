package com.codegnan.numbers;

/*
 * QUESTION:
 * Write a Java program to check whether a given number is a Palindrome or not.
 *
 * A number is called a palindrome if it reads the same forward and backward.
 *
 * Example:
 * Input  : 121
 * Output : 121 is a Palindrome Number
 *
 * Input  : 123
 * Output : 123 is Not a Palindrome Number
 */

import java.util.Scanner;

public class NumberPalindromeOrNot {

    public static void main(String[] args) {

        // Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        // Store original number for final comparison
        int original = num;

        int rev = 0; // variable to store reversed number

        // Reverse the number using while loop
        while (num != 0) {
            int digit = num % 10;      // extract last digit
            rev = rev * 10 + digit;    // build reversed number
            num = num / 10;            // remove last digit
        }

        // Check palindrome condition
        if (original == rev) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is Not a Palindrome Number");
        }

        sc.close(); // good practice: close scanner
    }
}