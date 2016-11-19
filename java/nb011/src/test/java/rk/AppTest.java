package rk;

<<<<<<< HEAD
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
    public void testApp()
    {
        assertTrue( true );
=======
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
>>>>>>> 976e826bddbe73f080bd8e13342a4946d15f0b11
    }
}
