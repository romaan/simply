package rk;

import java.util.Scanner;
import java.util.HashMap;

/**
 * Program to find first non-repeated character in a string
 *
 */
public class App 
{

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
