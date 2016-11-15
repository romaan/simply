package rk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class SolutionTest
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testSimpleCase()
    {
        char [][][]input = new char[5][][];
        input[0] = new char[][]{{'p'}};
        boolean sorted = Solution.isSorted(input, 0);
        assertTrue(sorted);
        input[1] = new char[][]{
                {'v', 'b', 'z', 'n', 'f', 'w', 'g'},
                {'e', 'a', 'c', 'k', 'l','w','k'},
                {'b','m','a','r','z','v','p'},
                {'r','w','g','n','j','q','d'},
                {'x','q','d','d','t','l','n'},
                {'w','u','x','t','d','u','k'},
                {'r','z','m','f','c','i','k'},
        };
        sorted = Solution.isSorted(input, 1);
        assertFalse(sorted);
        input[2] = new char[][]{
                {'t','j','x','x','x'},
                {'x','t','x','x','j'},
                {'r','z','z','z','z'},
                {'z','z','r','z','z'},
                {'r','z','z','z','z'}
        };
        sorted = Solution.isSorted(input, 2);
        assertTrue(sorted);
        input[3] = new char[][]{
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'},
                {'z','z','z','z','z','z','z','z','z','z'}
        };
        sorted = Solution.isSorted(input, 3);
        assertTrue(sorted);
        input[4] = new char[][]{
                {'u','m','c','u','o','q','a','j'},
                {'b','b','j','g','b','h','c','r'},
                {'l','p','o','m','a','e','r','v'},
                {'t','k','n','r','n','d','s','j'},
                {'q','x','y','x','b','t','n','a'},
                {'w','k','t','o','e','d','y','l'},
                {'k','p','f','y','j','l','p','m'},
                {'g','e','i','x','i','e','r','y'}
        };
        sorted = Solution.isSorted(input, 4);
        assertFalse(sorted);
    }
}
