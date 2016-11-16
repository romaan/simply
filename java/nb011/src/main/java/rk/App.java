package rk;

import java.util.*;


/**
 * Given an integer, n, find each x such that:
 * n + x = n ^ x
 * 0 <= x <= n
 */

public class App
{
    public static double optimizedCount(long n) {
        // if n + x = n ^ x then n & x == 0, hence count the number of zeros and raise it to power 2 to list all the combinations
        long zeros = 0;
        while (n != 0) {
            if ((n & 0x01) == 0)
                zeros++;
            n >>= 1;
        }
        return Math.pow(2, zeros);
    }

    public static long count(long n) {
        long count = 0;
        for (long i = 0; i <= n; i++) {
            if (n + i == (n ^ i)) {
                count++;
            }
        }
        return count;
    }

    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(count(n));
        System.out.println(optimizedCount(n));
    }
}
