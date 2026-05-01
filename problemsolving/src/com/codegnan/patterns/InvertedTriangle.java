package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print an Inverted Right-Angle Triangle Pattern using stars (*).
 *
 * Example (n = 5):
 *
 * *****
 * ****
 * ***
 * **
 * *
 */

public class InvertedTriangle {

    public static void main(String[] args) {

        int n = 5; // number of rows

        // Outer loop controls number of rows (from n to 1)
        for (int i = n; i >= 1; i--) {

            // Inner loop prints stars equal to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }
    }
}