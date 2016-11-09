package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MyStackTest
{
    @Test(expected=StackOverflowException.class)
    public void testMyStackOverflow() throws StackOverflowException
    {
        MyStack<Character> c = new MyStack<Character>(5);
        c.push('a');
        c.push('b');
        c.push('c');
        c.push('d');
        c.push('e');
        c.push('f');
    }

    @Test(expected=StackUnderflowException.class)
    public void testMyStackUnderflow() throws StackUnderflowException, StackOverflowException
    {
        MyStack<Character> c = new MyStack<Character>(5);
        c.push('a');
        c.push('b');
        c.push('c');
        c.push('d');
        c.push('e');
        assertTrue("Expect value e", c.pop().equals('e'));
        for (int i = 0; i < 5; i++)
            c.pop();
    }
}
