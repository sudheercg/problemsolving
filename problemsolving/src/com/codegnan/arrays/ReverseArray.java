package com.codegnan.arrays;

/*
 Question:
 Write a Java program to reverse an integer array and print the elements 
 in reverse order.

 Example:
 Input:
 {1, 2, 3, 4}

 Output:
 4 3 2 1
*/

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println("Reversed array:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Expected Output:
Reversed array:
4 3 2 1
*/