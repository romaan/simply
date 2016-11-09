package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class PrimeGeneratorTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        long[] numbers = PrimeGenerator.prime(20);
        assertArrayEquals(new long[] {0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1,1,1, 0, 1,0}, numbers);
    }
}
