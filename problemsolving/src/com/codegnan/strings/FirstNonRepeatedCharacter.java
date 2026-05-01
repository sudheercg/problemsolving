package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to find the first non-repeated character in a given string.
 *
 * Concept:
 * A non-repeated character is a character that appears only once in the string.
 * We need to return the first such character from left to right.
 *
 * Example:
 * Input  : swiss
 * Output : w
 *
 * Input  : aabbcc
 * Output : No non-repeated character found
 */

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = ' ';
        boolean found = false;

        // Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {

            boolean repeated = false;

            // Check whether current character appears elsewhere
            for (int j = 0; j < str.length(); j++) {

                // Skip same index comparison
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            // If not repeated, this is the first non-repeated character
            if (!repeated) {
                result = str.charAt(i);
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found");
        }

        sc.close();
    }
}