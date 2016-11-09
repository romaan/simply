package rk;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Generate Prime numbers
 *
 */
public class PrimeGenerator
{

    public static long[] prime(int size) {
        long []numbers = new long[size];
        for (int i = 2; i <= sqrt(size); i++) {
            for (int j = i * i; j < size; j += i) {
                numbers[j] = 1;
            }
        }
        return numbers;
    }
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the maximum value:");
        int size = in.nextInt();
        System.out.println("Prime:");
        long[] numbers = prime(size);
        for (int i = 2; i < size; i++)
            if (numbers[i] != 1) {
                System.out.print(" " + i);
            }
    }
}
