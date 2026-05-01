package com.codegnan.numbers;

import java.util.Scanner;

/*
 Question:
 Write a Java program to count the number of digits in a given integer.

 Example:
 Input:
 12345

 Output:
 Number of digits: 5
*/

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        // Count digits
        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}

/*
Sample Input:
12345

Expected Output:
Number of digits: 5
*/