package com.codegnan.numbers;

import java.util.Scanner;

/*
 Question:
 Write a Java program to find the Greatest Common Divisor (GCD) 
 of two numbers using an iterative approach.

 The GCD (Greatest Common Divisor) of two numbers is the largest 
 number that divides both numbers without leaving a remainder.

 Example:
 Input:
 a = 12, b = 18

 Output:
 GCD: 6
*/

public class GCD {

    // Method to find GCD
    static int gcd(int a, int b) {

        // If one number is 0, return the other
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }

        // Find minimum of a and b
        int result = Math.min(a, b);

        // Loop from min downwards
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));

        sc.close();
    }
}

/*
Sample Input:
a = 12
b = 18

Expected Output:
GCD: 6
*/