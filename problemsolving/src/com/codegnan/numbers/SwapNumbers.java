package com.codegnan.numbers;

/*
 * QUESTION:
 * Write a Java program to swap two numbers without using a third variable.
 *
 * Example:
 * Input  :
 * a = 10
 * b = 20
 *
 * Output :
 * After swapping:
 * First number = 20
 * Second number = 10
 */

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swapping logic without using third variable
        a = a + b; // Step 1: sum stored in a
        b = a - b; // Step 2: original value of a assigned to b
        a = a - b; // Step 3: original value of b assigned to a

        // Output result
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        sc.close(); // good practice
    }
}