package com.codegnan.arrays;

/*
 Question:
 Write a Java program to find all pairs of elements in an array 
 whose sum is equal to a given target value.

 Example:
 Input:
 Array: {2, 7, 11, 15}
 Target: 9

 Output:
 Pair: 2 7
*/

public class PairWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Pairs with given sum:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + " " + arr[j]);
                }
            }
        }
    }
}

/*
Expected Output:
Pairs with given sum:
Pair: 2 7
*/