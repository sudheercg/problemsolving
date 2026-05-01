package com.codegnan.numbers;

import java.util.Scanner;

/*
 Question:
 Write a Java program to calculate the factorial of a given number 
 using a loop.

 Factorial of a number n is defined as:
 n! = n × (n-1) × (n-2) × ... × 1

 Example:
 Input:
 5

 Output:
 Factorial of 5 is 120
*/

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int fact = 1;

        // Calculate factorial using loop
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();
    }
}

/*
Sample Input:
5

Expected Output:
Factorial of 5 is 120
*/