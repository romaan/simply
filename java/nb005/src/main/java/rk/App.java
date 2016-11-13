package rk;

import java.util.Scanner;

/**
 * Detect a unique element in an array of duplicates
 *
 */
public class App
{
    /* the algorithm assumes that there is an array of non zero elements and that the numbers repeated are 2, 4, 6 or so on times,
    * so that xor cancels the element
     */
    public static int findUnique(int []elements) {
        int unique = elements[0];
        for (int i = 1; i < elements.length; i++) {
            unique = unique ^ elements[i];
        }
        return unique;
    }

    public static void main( String[] args )
    {
        System.out.println( "Enter number of elements:" );
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []elements = new int[size];
        int i = 0;
        System.out.println("Enter the elements:");
        while (i < size) {
            elements[i++] = sc.nextInt();
        }
        int unique = findUnique(elements);
        System.out.println("Unique element is:" + unique);
    }
}
