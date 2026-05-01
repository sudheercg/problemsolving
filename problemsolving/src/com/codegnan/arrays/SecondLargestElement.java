package com.codegnan.arrays;

/*
 Question:
 Write a Java program to find the second largest element in an integer array.

 Example:
 Input:
 {10, 20, 4, 45, 99}

 Output:
 Second Largest: 45
*/

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 4, 45, 99};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } 
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
}

/*
Expected Output:
Second Largest: 45
*/