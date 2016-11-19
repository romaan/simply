import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sample Input

3 2 3
1 2 3
0
1
2
Sample Output

2
3
1

Explanation

After the first rotation, the array becomes .
After the second (and final) rotation, the array becomes .

Let's refer to the array's final state as array . For each query, we just have to print the value of  on a new line:

m = 0, so we print  on a new line.
m = 1, so we print  on a new line.
m = 2, so we print  on a new line.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[(n - (k % n) + m) % n]);
        }


    }
}