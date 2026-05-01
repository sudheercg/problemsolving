package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print an Increasing Number Pattern.
 *
 * Example (n = 4):
 *
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

public class IncreasingNumbers {

    public static void main(String[] args) {

        int n = 4; // number of rows

        // Outer loop controls number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints numbers from 1 to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // move to next line after each row
        }
    }
}