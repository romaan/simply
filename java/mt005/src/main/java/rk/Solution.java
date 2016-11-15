package rk;

import java.io.*;
import java.util.*;

/*
 * Sort a matrix lexicographically.
 * Given a squared sized grid  of size  in which each cell has a lowercase letter. Denote the character in the th row and in the th column as .

You can perform one operation as many times as you like: Swap two column adjacent characters in the same row  and  for all valid .

In other words, is it possible to rearrange the grid such that every row and every column is lexicographically sorted?

Note: , if letter  is equal to  or is before  in the alphabet.

Input Format

The first line begins with , the number of testcases. In each testcase you will be given . The following  lines contain  lowercase english alphabet each, describing the grid.

Constraints

 will be a lower case letter

Output Format

Print  lines. On the th line print YES if it is possible to rearrange the grid in the th testcase or NO otherwise.

Sample Input

1
5
ebacd
fghij
olmkn
trpqs
xywuv
Sample Output

YES
 */



public class Solution {

    public static boolean isSorted(char [][][]input, int k) {
        char temp;
        /* Check if possible every test case */
        // For each row in matrix
        for (int x = 0; x < input[k].length; x++) {
            // Sort each element with swap operation inside a row
            for (int i = 0; i < input[k].length - 1; i++) {
                for (int j = 0; j < input[k].length - i - 1; j++) {
                    if (input[k][x][j] > input[k][x][j+1]) {
                        temp = input[k][x][j];
                        input[k][x][j] = input[k][x][j+1];
                        input[k][x][j+1] = temp;
                    }
                }
            }

            if (x > 0) {
                // Check vertically if they are sorted, if not print NO and halt
                for (int y = 0; y < input[k].length - 1; y++) {
                    if (input[k][x][y] < input[k][x - 1][y]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Input */
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        sc.nextLine();
        char [][][] input = new char[testcases][][];
        for (int k = 0; k < testcases; k++) {
            int size = sc.nextInt();
            sc.nextLine();
            input[k] = new char[size][size];
            for (int i = 0; i < size; i ++)
                input[k][i] = sc.nextLine().toCharArray();
        }
        for (int k = 0; k < input.length; k++) {
            boolean sorted = isSorted(input, k);
            if (sorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}