package com.codegnan.arrays;

/*
 Question:
 Write a Java program to remove duplicate elements from an integer array 
 without using any extra data structures, and print only unique elements.

 Example:
 Input:
 {1, 2, 2, 3, 4, 4}

 Output:
 1 2 3 4
*/

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4};

        System.out.println("Unique elements:");

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check if element already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print only if not duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

/*
Expected Output:
Unique elements:
1 2 3 4
*/