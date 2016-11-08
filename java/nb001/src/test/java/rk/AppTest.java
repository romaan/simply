package rk;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSwapB()
    {
        App a = new App(3, 2);
        assertEquals(a.x, 3);
        assertEquals(a.y, 2);
        a.swapB();
        assertEquals(a.x, 2);
        assertEquals(a.y, 3);
    }

    public void testSwapC()
    {
        App c = new App(5, 9);
        assertEquals(c.x, 5);
        assertEquals(c.y, 9);
        c.swapC();
        assertEquals(c.x, 9);
        assertEquals(c.y, 5);
    }

    public void testSwapD()
    {
        App d = new App(10, 8);
        assertEquals(d.x, 10);
        assertEquals(d.y, 8);
        d.swapD();
        assertEquals(d.x, 8);
        assertEquals(d.y, 10);
    }
}
