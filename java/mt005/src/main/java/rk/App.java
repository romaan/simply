import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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

    public static void main(String[] args) {
        /* Input */
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        char [][][] input = new char[testcases][][];
        char temp;
        for (int k = 0; k < testcases; k++) {
            int size = sc.nextInt();
            input[k] = new char[size][size];
            for (int i = 0; i < size; i ++)
                for (int j = 0; j < size; j++) {
                    try {
                        input[k][i][j] = (char) (System.in.read());
                    } catch(IOException e) {
                        System.out.println("IOException has been caught");
                    }
                }
        }
        /* Check if possible every test case */
        for (int k = 0; k < input.length; k++) {
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
            }
            // Check vertically if they are sorted, if not print NO and halt
            for (int x = 0; x < input[k].length; x++) {
                for (int y = 0; y < input[k].length - 1; y++) {
                    if (input[k][y][x] > input[k][y + 1][x]) {
                        System.out.println("NO");
                    }
                }
            }
        }
        System.out.println("YES");
    }
}