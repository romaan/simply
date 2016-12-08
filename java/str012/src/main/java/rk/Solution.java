import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math;
import java.util.regex.*;

/*
* Count the number of letters required to remove to make it an anagram
* Sample Input:
* fcrxzwscanmligyxyvym
jxwtrhvujlmrpdoqbisbwhmgpmeoke
* Sample output: 30
 */
public class Solution {
    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        for (int i = 0; i < first.length(); i++) {
            if (h.containsKey(first.charAt(i))) {
                h.put(first.charAt(i), h.get(first.charAt(i)) + 1);
            } else {
                h.put(first.charAt(i), 1);
            }
        }
        for (int i = 0; i < second.length(); i++) {
            if (h.containsKey(second.charAt(i))) {
                h.put(second.charAt(i), h.get(second.charAt(i)) - 1);
            } else {
                h.put(second.charAt(i), -1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry: h.entrySet()) {
            count += Math.abs(entry.getValue());
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
