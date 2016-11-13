package rk;

/**
 * Towers of hanoii
 *
 */
public class Hanoii
{
    public static void hanoii(int n, String source, String dest, String aux) {
        if (n > 0) {
            hanoii(n - 1, source, aux, dest);
            System.out.println("Move disk " + n + " from " + source + " to " + dest);
            hanoii(n - 1, aux, dest, source);
        }
    }

    public static void main( String[] args )
    {
        hanoii(3, "A", "B", "C");
    }
}
