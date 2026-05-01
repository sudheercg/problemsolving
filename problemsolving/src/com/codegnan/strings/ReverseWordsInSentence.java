package com.codegnan.strings;

/*
 * QUESTION:
 * Write a Java program to reverse the words in a given sentence.
 *
 * Concept:
 * - Split the sentence into words
 * - Print the words in reverse order
 *
 * Example:
 * Input  : Java is fun
 * Output : fun is Java
 */

import java.util.Scanner;

public class ReverseWordsInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        // Step 1: Split sentence into words using space
        String[] words = s.split(" ");

        System.out.print("Reversed sentence: ");

        // Step 2: Print words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}