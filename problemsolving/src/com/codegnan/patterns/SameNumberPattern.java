package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print a Same Number Pattern.
 *
 * In this pattern, each row prints the row number repeatedly.
 *
 * Example (n = 4):
 *
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 */

public class SameNumberPattern {

    public static void main(String[] args) {

        int n = 4; // number of rows

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints the same number i times in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println(); // move to next line
        }
    }
}