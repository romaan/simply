package rk;

/**
 * Hello world!
 *
 */
public class KnapSack
{
    public static int [][]optimal(int capacity, int []weight, int []value) {
        int [][]ks = new int[weight.length][capacity];


    }

    public static void main( String[] args )
    {
        System.out.println( "Enter max capacity:" );
        int capacity = 10;
        System.out.println("Enter the number of items:");
        int items = 5;
        System.out.println( "Enter weight of items:");
        int []weight = new int[items]{};
        System.out.println("Enter value of items:");
        int []value = new int[items]{};
        int d2 = optimal(capacity, weight, value);
    }
}
