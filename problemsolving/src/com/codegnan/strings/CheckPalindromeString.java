package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to check whether a given string is a Palindrome or not.
 *
 * Definition:
 * A string is called a palindrome if it reads the same forward and backward.
 *
 * Example:
 * Input  : madam
 * Output : Palindrome
 *
 * Input  : hello
 * Output : Not Palindrome
 */

import java.util.Scanner;

public class CheckPalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Store original string for comparison
        String original = str;

        String rev = ""; // stores reversed string

        // Step 1: Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Step 2: Compare original and reversed string
        if (original.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}