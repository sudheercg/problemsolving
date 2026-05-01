package com.codegnan.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * QUESTION:
 * Read integers from a file and calculate sum.
 * Handle checked exceptions properly.
 */

public class FileHandlingSum {

    public static void main(String[] args) {

        int sum = 0;

        try {

            File file = new File("numbers.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextInt()) {
                sum += sc.nextInt();
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {
            System.out.println("Calculation completed");
        }

        System.out.println("Sum: " + sum);
    }
}