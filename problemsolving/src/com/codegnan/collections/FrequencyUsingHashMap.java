package com.codegnan.collections;

import java.util.HashMap;

/*
 Question:
 Write a Java program to count the frequency of elements in an array 
 using HashMap from the Collections Framework.

 Example:
 Input:
 {1, 2, 2, 3, 1, 2}

 Output:
 {1=2, 2=3, 3=1}
*/

public class FrequencyUsingHashMap {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency using HashMap
        for (int num : arr) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Element Frequencies: " + map);
    }
}

/*
Expected Output:
Element Frequencies: {1=2, 2=3, 3=1}
*/