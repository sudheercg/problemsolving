package com.codegnan.numbers;

/*
 * QUESTION:
 * Write a Java program to check whether a given number is a Prime number or not.
 *
 * A prime number is a number greater than 1 that has no divisors other than 1 and itself.
 *
 * Example:
 * Input  : 7
 * Output : 7 is a Prime Number
 *
 * Input  : 10
 * Output : 10 is Not a Prime Number
 */

import java.util.Scanner;

public class PrimeCheck {

    // Method to check whether a number is prime
    static boolean isPrime(int n) {

        // Step 1: Handle numbers <= 1 (not prime by definition)
        if (n <= 1)
            return false;

        // Step 2: Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false; // Found a divisor → not prime
        }

        // Step 3: No divisors found → prime number
        return true;
    }

    public static void main(String[] args) {

        // Scanner to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check and display result in user-friendly format
        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

        sc.close(); // Good practice: release resource
    }
}