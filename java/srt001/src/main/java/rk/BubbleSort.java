package rk;

/**
 * Bubble sort: Sort elements using bubble sort approach. Time complexity: O(n^2)
 * In every iteration, one right most or left most element is sorted
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Random;


public class BubbleSort<T>
{

    private List<T> elements;

    public BubbleSort(T[] input) {
        elements = Arrays.asList(input);
    }

    public void bubbleSort() {
        for (int i = 0; i < elements.size() - 1; i++) {
            for (int j = 0; j < elements.size() - i - 1; j++) {
                if (((Integer) elements.get(j)).compareTo((Integer)elements.get(j+1)) > 0)
                {
                    T temp = elements.get(j);
                    elements.set(j, elements.get(j + 1));
                    elements.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public List<T> getElements() {
        return elements;
    }

    public static void main( String[] args )
    {
        System.out.println("Enter the number of elements");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Integer [] elements = new Integer[size];
        Random r = new Random();
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            elements[i] = r.nextInt(100);
        }
        BubbleSort<Integer> bs = new BubbleSort<Integer>(elements);
        System.out.println("Elements before sort:");
        System.out.println(bs.toString());
        bs.bubbleSort();
        System.out.println("Elements after sort:");
        System.out.println(bs.toString());

    }
}
