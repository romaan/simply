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
        Solution s = new Solution("0", "1", "5");
        s.fibo();
        assertTrue(s.get().equals("5"));
    }
}
