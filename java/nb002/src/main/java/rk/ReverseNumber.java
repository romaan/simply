package rk;

import java.util.Random;

/**
 * Reverse a number: Please note that the below strategy does not work if the number has 0 at the end
 *
 */
public class ReverseNumber
{
    public static long reverse(long input) {
        long reversed = 0L;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
        }
        return reversed;
    }

    public static void main( String[] args )
    {
        System.out.println("Reversing random integers and long numbers");
        Random r = new Random();
        long value = r.nextLong();
        System.out.println("Original value:" + value);
        System.out.println("Reversed value:" + reverse(value));
    }
}
