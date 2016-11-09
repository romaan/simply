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
    public void testAppA()
    {
        char c = App.firstNonRepeatedStringA("rorfo");
        assertEquals('f', c);
    }

    @Test
    public void testAppB()
    {
        char c = App.firstNonRepeatedStringB("rorfo");
        assertEquals('f', c);
    }
}
