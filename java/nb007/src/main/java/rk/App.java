package rk;

/**
 * Hello world!
 *
 */
public class App 
{
    private static double delta = 0.0001d;
    public static int compareTo(double a, double b) {
        if (a - b < 0) {
            return -1;
        } else if (a - b <= delta) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double sqroot(double number) {
        double start = 0;
        double end = number;
        while (start <= end) {
            double mid = (start + end) / 2;
            int compare = compareTo(mid * mid, number);
            if (compare == 0) {
                return mid;
            } else if (compare > 0) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return 0;
    }

    public static void main( String[] args )
    {
        System.out.println(sqroot(22));
    }
}
