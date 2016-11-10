package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        int[] elements = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        assertTrue(App.findIndex(elements, 6) == 2);
        assertTrue(App.findIndex(elements, 7) == -1);
    }
}
