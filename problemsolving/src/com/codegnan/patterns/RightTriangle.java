package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print a Right-Angle Triangle Pattern using stars (*).
 *
 * Example (n = 5):
 *
 * *
 * **
 * ***
 * ****
 * *****
 */

public class RightTriangle {

    public static void main(String[] args) {

        int n = 5; // number of rows

        // Outer loop controls number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints stars equal to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }
    }
}