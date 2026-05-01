package com.codegnan.arrays;

/*
 Question:
 Write a Java program to find the missing number in an array containing 
 numbers from 1 to n. The array has one number missing.

 Example:
 Input:
 Array: {1, 2, 4, 5}
 n = 5

 Output:
 Missing Number: 3
*/

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;

        // Sum of first n natural numbers
        int total = n * (n + 1) / 2;

        int sum = 0;

        // Calculate sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Missing number = total sum - array sum
        System.out.println("Missing Number: " + (total - sum));
    }
}

/*
Expected Output:
Missing Number: 3
*/