package rk;

/**
 * Program to swap two numbers
 *
 */
public class App
{
    int x;
    int y;

    public App(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void swapB() {
        int t = x;
        x = y;
        y = t;
    }

    public void swapC() {
        x = x + y;
        y = x - y;
        x = x - y;
    }

    public void swapD() {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }

    public static void swapA(Integer a, Integer b) {
        // 1. Wrapper classes are immutable and this won't work
        // 2. Object references are passed by value, hence doing
        // want is done below changes the references locally
        Integer t;
        t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args)
    {

    }
}
