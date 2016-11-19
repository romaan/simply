package rk;

import java.util.*;
import static java.lang.Math.*;
/**
 * Hello world!
 *
 */
public class KnapSack
{
    public static int [][]optimal(int capacity, int []weight, int []value) {
        // matrix of items * weight
        int items = weight.length; // or value.length
        int [][]ks = new int[items][capacity + 1];
        for (int i = 0; i < items; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (weight[i] <= j) {
                    if (i == 0) {
                        ks[i][j] = value[i];
                    } else {
                        ks[i][j] = max(value[i] + ks[i - 1][j - weight[i]], ks[i - 1][j]);
                    }
                } else if (i > 0) {
                    ks[i][j] = ks[i - 1][j];
                }
            }
        }

        for (int i = 0; i < items; i++) {
            for (int j = 0; j <= capacity; j++) {
                System.out.print(ks[i][j] + " ");
            }
            System.out.println();
        }
        return ks;
    }

    public static List trace(int [][]ks, int []wt) {
        List<Integer> items = new ArrayList<Integer>();
        int i = ks.length - 1;
        int j = ks[0].length - 1;
        while (ks[i][j] != 0) {
            if (ks[i][j] != ks[i-1][j]) {
                items.add(i);
                j = j - wt[i];
                i = i - 1;
            } else {
                i = i - 1;
            }
            if (i - 1 < 0) {
                items.add(i);
                return items;
            }
        }
        return items;
    }

    public static void main( String[] args )
    {
        System.out.println( "Enter max capacity:" );
        int capacity = 7;
        System.out.println("Enter the number of items:");
        int items = 4;
        System.out.println( "Enter weight of items:");
        int []weight = new int[]{3, 4, 5, 1};
        System.out.println("Enter value of items:");
        int []value = new int[]{4, 5, 7, 1};
        int [][]ks = optimal(capacity, weight, value);
        List<Integer> bag = trace(ks, weight);
        System.out.println("Items:");
        for (Integer i: bag) {
            System.out.println(i + " ");
        }
    }
}
