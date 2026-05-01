package com.codegnan.numbers;

import java.util.Scanner;

/*
 Question:
 Write a Java program to print the Fibonacci series up to n terms.

 The Fibonacci series is:
 0, 1, 1, 2, 3, 5, 8, ...

 Example:
 Input:
 5

 Output:
 0 1 1 2 3
*/

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            b = a;
            a = temp;
        }

        sc.close();
    }
}

/*
Sample Input:
5

Expected Output:
Fibonacci Series:
0 1 1 2 3
*/