package rk;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Exception;

/**
 * Unit test for simple App.
 */
public class CQueueTest
{
    /**
     * Rigourous Test :-)
     */
    @Test(expected = Exception.class)
    public void testInsertion() throws Exception
    {
        CQueue<Character> cq = new CQueue<Character>(5);
        cq.add('a');
        cq.add('b');
        cq.add('c');
        cq.add('d');
        cq.remove();
        cq.remove();
        cq.add('e');
        cq.add('f');
    }
}
