package rk;

import java.lang.Math;
/**
 * Find if two double numbers are equal within the predefined accuracy number
 *
 */
public class App 
{
    double number;

    public App(double number) {
        this.number = number;
    }

    /*
    * Double or float should not be compared using == but using < or >
     */
    public boolean equals(App number, int value) {
        double precision = 1.0d / Math.pow(10, value);
        if (this.number - number.get() < precision) {
            return true;
        }
        return false;
    }

    public double get() {
        return number;
    }

    public static void main( String[] args )
    {
        App a = new App(24.222);
        App b = new App(24.21);
        System.out.println(a.equals(b, 3));
    }
}
