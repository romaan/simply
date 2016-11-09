package rk;

/**
 * Program implementing stack and its operations using List
 *
 */
public class MyStack<T>
{
    private T[] stack;
    private int ptr = -1;

    public MyStack(int size) {
        stack = (T[]) new Object[size];
    }

    public T push(T element) throws StackOverflowException {
        if (ptr + 1 == stack.length)
            throw new StackOverflowException("Stack overflow");
        stack[++ptr] = element;
        return element;
    }

    public T pop() throws StackUnderflowException  {
        if (ptr == -1)
            throw new StackUnderflowException("Stack underflow");
        return stack[ptr--];
    }

    public static void main( String[] args )
    {
        MyStack<Integer> s = new MyStack<Integer>(10);
        try {
            s.push(23);
        } catch (StackOverflowException e) {
            e.printStackTrace();
        }
    }
}
