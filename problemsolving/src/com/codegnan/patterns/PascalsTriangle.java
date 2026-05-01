package com.codegnan.patterns;

/*
 * QUESTION:
 * Write a Java program to print Pascal’s Triangle.
 *
 * Pascal’s Triangle is a triangular array where each number is the sum of the two numbers above it.
 *
 * Example (n = 4):
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 */

public class PascalsTriangle {

    public static void main(String[] args) {

        int n = 4; // number of rows

        // Outer loop controls rows
        for (int i = 0; i < n; i++) {

            int num = 1; // first value in each row is always 1

            // Inner loop prints elements of each row
            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");

                // Formula to calculate next value in row
                num = num * (i - j) / (j + 1);
            }

            System.out.println(); // move to next line
        }
    }
}