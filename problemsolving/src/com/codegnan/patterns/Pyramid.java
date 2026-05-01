package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print a Pyramid Pattern using stars (*).
 *
 * Example (n = 5):
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */

public class Pyramid {

    public static void main(String[] args) {

        int n = 5; // number of rows

        // Outer loop controls number of rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars in increasing odd pattern (1, 3, 5, ...)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }
    }
}