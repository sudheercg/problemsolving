package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to reverse a given string.
 *
 * Concept:
 * The characters of the string should be printed in reverse order.
 *
 * Example:
 * Input  : hello
 * Output : olleh
 */

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Reversed string: ");

        // Traverse string from last index to first index
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}