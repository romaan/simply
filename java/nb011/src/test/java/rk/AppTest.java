package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Given an integer, n, find each x such that:
 * n + x = n ^ x
 * 0 <= x <= n
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp1()
    {
        assertTrue(App.count(5L) == 2L);
    }

    @Test
    public void testApp2()
    {
        assertTrue(App.count(10L) == 4L);
    }

    @Test
    public void testApp3()
    {
        assertTrue(App.optimizedCount(1000000000000000L) == 1073741824);
    }
}
