package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print a Diamond Pattern using stars (*).
 *
 * Example (n = 5):
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

public class DiamondPattern {

    public static void main(String[] args) {

        int n = 5; // height of upper half of diamond

        /* ---------------- UPPER PART ---------------- */
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (odd pattern: 1, 3, 5, 7...)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }

        /* ---------------- LOWER PART ---------------- */
        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars in reverse order
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }
    }
}