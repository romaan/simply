package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ReverseTest {
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testReverse() {
        long value = 1234567890L;
        assertEquals(987654321L, ReverseNumber.reverse(value));
    }
}
