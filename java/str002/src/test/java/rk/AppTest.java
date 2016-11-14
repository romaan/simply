package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue("olleH".equals(App.reverser("Hello")));
        assertTrue("olleH".equals(App.reversei("Hello")));
    }
}
