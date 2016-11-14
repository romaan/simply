package rk;

/**
 * Reverse a string iteratively or recursively
 *
 */
public class App 
{
    public static String reverser(String sentence) {
        if (sentence.length() == 1)
            return sentence;
        return reverser(sentence.substring(1)) + sentence.charAt(0);
    }

    public static String reversei(String sentence) {
        int i;
        StringBuilder reversed = new StringBuilder();
        for (i = 0; i < sentence.length(); i++)
            reversed.append(sentence.charAt(sentence.length() - i - 1));
        return reversed.toString();
    }
    public static void main( String[] args )
    {
        System.out.println("Revese string: Hello");
        System.out.println("Revese string: " +  reverser("Hello"));
        System.out.println("Revese string: " + reversei("Hello"));
    }
}
