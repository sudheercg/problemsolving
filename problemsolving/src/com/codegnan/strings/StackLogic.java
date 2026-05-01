package com.codegnan.strings;

/*
 * QUESTION:
 * Check if parentheses are balanced.
 *
 * Example:
 * Input  : ((a+b)*c)
 * Output : Balanced
 *
 * Input  : (a+b))
 * Output : Not Balanced
 */

public class StackLogic {

    public static void main(String[] args) {

        String str = "((a+b)*c)";

        int count = 0;
        boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;

                if (count < 0) {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (count == 0 && isBalanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}