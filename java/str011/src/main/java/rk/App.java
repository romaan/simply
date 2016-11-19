package rk;

import java.util.*;

/*
Steve has a string, s, consisting of n lowercase English alphabetic letters. In one
operation, he can delete any pair of adjacent letters with same value. For example,
string "aabcc" would become either "aab" or "bcc" after operation.
Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.
 */

public class App {

    public static String reduce(String s) {
        StringBuffer input = new StringBuffer(s);
        int i = 0;
        while (i < input.length() - 1) {
            boolean stepback = false;
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                input.deleteCharAt(i);
                input.deleteCharAt(i);
                stepback = true;
            }
            if (stepback) {
                if (i > 0) i--;
            } else {
                i++;
            }
        }
        if (input.length() ==0) {
            input = new StringBuffer("Empty String");
        }
        return input.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reduce(sc.nextLine());

    }
}