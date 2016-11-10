package rk;

/**
 * Binary Search: The elements should be sorted to perform a binary search
 *
 */
public class App 
{
    public static int findIndex(int[] elements, int searchElement) {
        int low = 0;
        int high = elements.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (elements[mid] == searchElement) {
                return mid;
            } else if (searchElement < elements[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main( String[] args )
    {
        int[] elements = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println( "Searched index: " + findIndex(elements, 6));
        System.out.println( "Searched index: " + findIndex(elements, 7));
    }
}
