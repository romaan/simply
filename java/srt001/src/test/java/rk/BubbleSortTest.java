package rk;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest
{
    @Test
    public void testSort()
    {
        Integer []numbers = new Integer[] {34,23,21,43,54,4,2};
        BubbleSort<Integer> bs = new BubbleSort<Integer>(numbers);
        bs.bubbleSort();
        List<Integer> sorted = bs.getElements();
        assertArrayEquals(new Integer[]{2,4,21,23,34,43,53}, sorted.toArray());
    }
}
