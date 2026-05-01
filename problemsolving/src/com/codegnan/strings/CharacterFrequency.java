package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to find the frequency of each character in a given string.
 *
 * Example:
 * Input  : hello
 * Output :
 * h -> 1
 * e -> 1
 * l -> 2
 * o -> 1
 */

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Outer loop: picks each character
        for (int i = 0; i < s.length(); i++) {

            int freq = 1;        // frequency of current character
            boolean isFound = false; // to avoid duplicate counting

            // Step 1: check if character already processed
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isFound = true;
                    break;
                }
            }

            // Step 2: if not already processed, count frequency
            if (!isFound) {

                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        freq++;
                    }
                }

                // Step 3: print result
                System.out.println(s.charAt(i) + " -> " + freq);
            }
        }

        sc.close(); // good practice
    }
}