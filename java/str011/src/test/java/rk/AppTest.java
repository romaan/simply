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
    public void testApp1()
    {
        assertTrue(App.reduce("aaabccddd").equals("abd"));
    }

    @Test
    public void testApp2()
    {
        assertTrue(App.reduce("aa").equals("Empty String"));
    }

    @Test
    public void testApp3()
    {
        assertTrue(App.reduce("baab").equals("Empty String"));
    }

    @Test
    public void testAp4()
    {
        assertTrue(App.reduce("aaaa").equals("Empty String"));
    }
}
