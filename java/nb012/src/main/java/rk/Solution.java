package rk;

/*
You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).

Input Format

The first line of the input contains the list size , which is followed by  lines, each line having an integer from the list.

Sample Input

3
2147483647
1
0
Sample Output

2147483648
4294967294
4294967295
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = ~sc.nextLong();
            System.out.println((x & 0xFFFFFFFFL));
        }
    }
}