package rk;

import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
/**
 * Program implementing stack and its operations using List
 *
 */
public class MyStack<T>
{
    T[] stack;

    public MyStack(int size) {
        stack = new T[size];
    }

    public void push(T element) throws StackOverflowException {
        if (stack.size())
            throw new StackOverflowException("Stack overflow");
        stack.add(element);
    }

    public T pop() throws StackUnderflowException  {
        if (stack.size() == 0)
            throw new StackUnderflowException("Stack underflow");
        return stack.remove(stack.size() - 1);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MyStack<Integer> s = new MyStack<Integer>();
        try {
            s.push(23);
        } catch (StackOverflowException e) {
            e.printStackTrace();
        }
    }
}
