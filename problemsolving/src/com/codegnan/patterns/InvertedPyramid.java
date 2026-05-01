package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print an Inverted Pyramid Pattern using stars (*).
 *
 * Example (n = 5):
 *
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

public class InvertedPyramid {

    public static void main(String[] args) {

        int n = 5; // number of rows

        // Outer loop controls rows (from n to 1)
        for (int i = n; i >= 1; i--) {

            // Print leading spaces to shift pattern right
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1 stars per row)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }
    }
}