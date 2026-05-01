package com.codegnan.arrays;

import java.util.Arrays;

/*
 Question:
 Write a Java program to move all zeros in an array to the end 
 while maintaining the order of non-zero elements.

 Example:
 Input:
 {0, 1, 0, 3, 12}

 Output:
 [1, 3, 12, 0, 0]
*/

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*
Expected Output:
[1, 3, 12, 0, 0]
*/