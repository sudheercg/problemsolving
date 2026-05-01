package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to remove all whitespaces from a given string.
 *
 * Concept:
 * All spaces in the string should be removed and the result should be a continuous string.
 *
 * Example:
 * Input  : j a v a p r o g r a m
 * Output : javaprogram
 */

import java.util.Scanner;

public class RemoveWhitespaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Efficient way: replace all spaces in one go
        str = str.replace(" ", "");

        // Output result
        System.out.println("String after removing whitespaces: " + str);

        sc.close();
    }
}