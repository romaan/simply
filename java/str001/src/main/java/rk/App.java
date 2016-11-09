package rk;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Program to find first non-repeated character in a string
 *
 */
public class App 
{

    public static char firstNonRepeatedStringB(String aString) {
        /*
         * LinkedHashMap: "with predictable iteration order [...] which is normally the order in which keys were inserted into the map (insertion-order)."
         * HashMap: "makes no guarantees as to the order of the map"
         * TreeMap: "is sorted according to the natural ordering of its keys, or by a Comparator"
         */
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < aString.length(); i++) {
            if (map.containsKey(aString.charAt(i))) {
                map.put(aString.charAt(i), map.get(aString.charAt(i)).intValue() + 1);
            } else {
                map.put(aString.charAt(i), 1);
            }
        }
        for (Character c: map.keySet()) {
            if (map.get(c).equals(1)) {
                return c;
            }
        }
        return '\0';
    }

    public static char firstNonRepeatedStringA(String aString) {
        int i, j;
        for (i = 0; i < aString.length(); i++) {
            for (j = 0; j < aString.length(); j++) {
                if (i == j) {
                    continue;
                } else if (aString.charAt(i) == aString.charAt(j)) {
                    break;
                }
            }
            if (j == aString.length()) {
                return aString.charAt(i);
            }
        }
        return '\0';
    }

    public static void main( String[] args )
    {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        char c = firstNonRepeatedStringA(sb.toString());
        System.out.println("First non repeating character is:" + c);

    }
}
