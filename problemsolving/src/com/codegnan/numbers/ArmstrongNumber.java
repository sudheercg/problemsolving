package com.codegnan.numbers;

import java.util.Scanner;

/*
 Question:
 Write a Java program to check whether a given number is an Armstrong number.

 An Armstrong number is a number that is equal to the sum of its digits 
 each raised to the power of the number of digits.

 Example:
 Input:
 153

 Output:
 153 is an Armstrong Number
*/

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int count = 0;

        // Step 1: Count number of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;
        int sum = 0;

        // Step 2: Calculate sum of digits raised to power count
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp = temp / 10;
        }

        // Step 3: Check Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }

        sc.close();
    }
}

/*
Sample Input:
153

Expected Output:
153 is an Armstrong Number
*/