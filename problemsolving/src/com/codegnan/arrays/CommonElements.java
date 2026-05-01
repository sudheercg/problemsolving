package com.codegnan.arrays;

/*
 Question:
 Write a Java program to find and print the common elements between two integer arrays.

 Example:
 Input:
 Array 1: {1, 2, 3, 4}
 Array 2: {3, 4, 5, 6}

 Output:
 3 4
*/

public class CommonElements {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.println("Common elements are:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}

/*
Expected Output:
Common elements are:
3 4
*/