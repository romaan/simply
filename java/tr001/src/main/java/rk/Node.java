package rk;

/**
 * Implement a BST (Binary Search Tree) with insert and delete functions
 *
 */
public class Node<T>
{
    private Node left;
    private Node right;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    private Node getLeaf(T value) {
        if (value)
    }

    public void insert(Node n) {
        Node leaf = getLeaf(n.get());
        if (value.compareTo(n.get()) > 0) {
            leaf.right = n;
        } else {
            leaf.left = n;
        }
    }

    public T get() {
        return value;
    }

    public static void main( String[] args )
    {
        Node<Character> root = new Node<Character>('a');
        root.add(new Node<Character>('b'));
    }
}
