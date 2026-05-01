package com.codegnan.arrays;

import java.util.Arrays;

/*
 Question:
 Write a Java program to sort an integer array in ascending order 
 without using built-in sorting methods.

 Example:
 Input:
 {5, 2, 9, 1}

 Output:
 [1, 2, 5, 9]
*/

public class SortArrayWithoutSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1};

        // Sorting using simple comparison (Selection/Bubble-like approach)
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*
Expected Output:
[1, 2, 5, 9]
*/