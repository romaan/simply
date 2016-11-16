package rk;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private ArrayList<BigInteger> cache;
    private int n;

    public Solution(String t0, String t1, String n) {
        cache = new ArrayList<BigInteger>();
        cache.add(new BigInteger(t0));
        cache.add(new BigInteger(t1));
        this.n = (int) Integer.parseInt(n);
    }

    public void fibo() {
        for (int i = 2; i < n; i++) {
            BigInteger tm1 = cache.get(i - 1);
            BigInteger tm2 = cache.get(i - 2);
            BigInteger t = tm1.multiply(tm1).add(tm2);
            cache.add(t);
        }
    }

    public BigInteger get() {
        return cache.get(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());
        Solution s = new Solution(st.nextToken(), st.nextToken(), st.nextToken());
        s.fibo();
        System.out.println(s.get());
    }
}