package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to check whether two strings are Anagrams or not.
 *
 * Definition:
 * Two strings are called Anagrams if they contain the same characters
 * in the same frequency, but in any order.
 *
 * Example:
 * Input  : listen
 *          silent
 * Output : Anagram
 *
 * Input  : hello
 *          world
 * Output : Not Anagram
 */

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Step 1: Normalize strings (remove spaces + lowercase)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 2: If lengths differ → not anagram
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {

            // Step 3: Convert to char arrays
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            // Step 4: Sort both arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Step 5: Compare sorted arrays
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}