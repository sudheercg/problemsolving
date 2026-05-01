package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to find duplicate characters in a given string.
 *
 * Concept:
 * A character is considered duplicate if it appears more than once in the string.
 *
 * Example:
 * Input  : programming
 * Output : Duplicate characters are:
 *          r g m
 */

import java.util.Scanner;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Duplicate characters are:");

        // Traverse each character
        for (int i = 0; i < str.length(); i++) {

            boolean isDuplicatePrinted = false;

            // Check if character already processed
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    isDuplicatePrinted = true;
                    break;
                }
            }

            if (isDuplicatePrinted) {
                continue;
            }

            // Check duplicates ahead
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break; // print only once
                }
            }
        }

        sc.close();
    }
}