package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Question:
 Write a Java program to sort a List of integers using Comparator 
 (lambda expressions) in both ascending and descending order.

 Example:
 Input:
 [40, 10, 30, 20]

 Output:
 Ascending: [10, 20, 30, 40]
 Descending: [40, 30, 20, 10]
*/

public class SortListUsingComparator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        // Ascending Order
        Collections.sort(list, (a, b) -> a - b);
        System.out.println("Ascending: " + list);

        // Descending Order
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("Descending: " + list);
    }
}

/*
Expected Output:
Ascending: [10, 20, 30, 40]
Descending: [40, 30, 20, 10]
*/