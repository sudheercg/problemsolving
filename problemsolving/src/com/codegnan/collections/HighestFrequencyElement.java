package com.codegnan.collections;

import java.util.HashMap;
import java.util.Map;

/*
 Question:
 Write a Java program to find the element with the highest frequency 
 in an integer array using HashMap.

 Example:
 Input:
 {1, 2, 2, 3, 1, 2, 4, 1, 1}

 Output:
 Highest Frequency Element: 1
 Frequency: 4
*/

public class HighestFrequencyElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int maxKey = 0;
        int maxValue = 0;

        // Step 2: Find element with highest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Highest Frequency Element: " + maxKey);
        System.out.println("Frequency: " + maxValue);
    }
}

/*
Expected Output:
Highest Frequency Element: 1
Frequency: 4
*/