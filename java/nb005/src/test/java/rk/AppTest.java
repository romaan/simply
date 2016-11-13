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
        assertEquals(18, App.findUnique(new int[] {19,18,19,23,23}));
    }
}
