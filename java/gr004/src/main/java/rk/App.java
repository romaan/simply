import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long inf = Long.MAX_VALUE;

    public static long add(long a, long b) {
        if (a == inf || b == inf)
            return inf;
        return a + b;
    }

    public static void print(long [][]d) {
        System.out.println("Matrix");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (d[i][j] == inf)
                    System.out.print("-1" + " ");
                else
                    System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static long[][] floyd(long d[][]) {
        for (int k = 0; k < d.length; k++) {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length; j++) {
                    long temp = add(d[i][k], d[k][j]);
                    if (temp == inf)
                        continue;
                    if (d[i][j] > temp) {
                        d[i][j] = temp;
                    }
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long [][]d = new long[n][n];
        for (int i = 0; i < m; i++) {
            d[sc.nextInt() - 1][sc.nextInt() -1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && d[i][j] == 0) {
                    d[i][j] = inf;
                }
            }
        }
        d = floyd(d);
        long q = sc.nextLong();
        for (int i = 0; i < q; i++) {
            long ans  = d[sc.nextInt() - 1][sc.nextInt() - 1];
            if (ans == inf)
                ans = -1;
            System.out.println(ans);
        }
    }
}