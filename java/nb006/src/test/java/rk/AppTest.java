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
        App a = new App(24.222);
        App b = new App(24.21);
        assertFalse(a.equals(b, 3));
        assertTrue(new App(24.222).equals(new App(24.220), 2));
    }
}
