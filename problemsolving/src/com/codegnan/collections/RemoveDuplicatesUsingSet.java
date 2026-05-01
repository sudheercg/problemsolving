package com.codegnan.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 Question:
 Write a Java program to remove duplicate elements from an array 
 using Set implementations from the Collections Framework.

 Demonstrate the difference between:
 1) HashSet (does not maintain order)
 2) LinkedHashSet (maintains insertion order)

 Example:
 Input:
 {1, 2, 2, 3, 4, 4, 5}

 Output:
 HashSet: [unordered unique elements]
 LinkedHashSet: [1, 2, 3, 4, 5]
*/

public class RemoveDuplicatesUsingSet {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // HashSet → Does NOT maintain insertion order
        Set<Integer> hashSet = new HashSet<>();

        for (int num : arr) {
            hashSet.add(num);
        }

        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet → Maintains insertion order
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int num : arr) {
            linkedHashSet.add(num);
        }

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}

/*
Expected Output:
HashSet: [order may vary]
LinkedHashSet: [1, 2, 3, 4, 5]
*/