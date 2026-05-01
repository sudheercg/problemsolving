package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to count the number of vowels and consonants in a given string.
 *
 * Concept:
 * - Vowels: a, e, i, o, u
 * - Consonants: all other alphabets (excluding vowels)
 *
 * Example:
 * Input  : hello
 * Output :
 * Vowels: 2
 * Consonants: 3
 */

import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        // Convert to lowercase for uniform checking
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check only alphabets
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
    }
}