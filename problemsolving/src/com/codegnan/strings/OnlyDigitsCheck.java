package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to check whether a given string contains only digits.
 *
 * Concept:
 * A string is considered "digits only" if every character is between 0–9.
 *
 * Example:
 * Input  : 12345
 * Output : String contains only digits
 *
 * Input  : 12a45
 * Output : String does not contain only digits
 */

import java.util.Scanner;

public class OnlyDigitsCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean isDigitOnly = true;

        // Traverse each character and validate
        for (int i = 0; i < s.length(); i++) {

            if (!Character.isDigit(s.charAt(i))) {
                isDigitOnly = false;
                break; // stop early if non-digit found
            }
        }

        // Output result
        if (isDigitOnly) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does not contain only digits");
        }

        sc.close();
    }
}