package rk;

import java.lang.Exception;

/**
 * Circular Queue
 *
 */
public class CQueue<T>
{

    private int size;
    private int front;
    private int rear;
    private T[] queue;

    public CQueue(int size) {
        this.size = size;
        // NOTE: Generics
        queue = (T[]) new Object[size + 1];
    }

    public boolean add(T element) throws Exception {
        if ((rear + 1) % size == front) {
            throw new Exception("Full");
        }
        rear = (rear + 1) % size;
        queue[rear] = element;
        return true;
    }

    public T remove() throws Exception {
        if (front == rear) {
            throw new Exception("Empty");
        }
        front = (front + 1) % size;
        return queue[front];
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
