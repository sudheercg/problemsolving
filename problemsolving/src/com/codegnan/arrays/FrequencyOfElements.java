package com.codegnan.arrays;

/*
 Question:
 Write a Java program to count the frequency of each element in an integer array 
 without using any extra data structures.

 Example:
 Input:
 {1, 2, 2, 3, 1}

 Output:
 1 : 2
 2 : 2
 3 : 1
*/

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1};

        System.out.println("Element Frequencies:");

        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            boolean visited = false;

            // Check if element already processed
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            // If not visited, count occurrences
            if (!visited) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}

/*
Expected Output:
Element Frequencies:
1 : 2
2 : 2
3 : 1
*/