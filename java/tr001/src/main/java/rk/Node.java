package rk;

import java.util.HashMap;
/**
 * Implement a BST (Binary Search Tree) with insert and delete functions
 *
 */
public class Node<T extends Comparable<T>>
{
    private Node left;
    private Node right;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public void insert(T element) {
        if (value.compareTo(element) > 0) {
            if (right != null) {
                right.insert(element);
            } else {
                right = new Node<T>(element);
            }
        } else {
            if (left != null) {
                left.insert(element);
            } else {
                left = new Node<T>(element);
            }
        }
    }

    public void delete(T element) {
        if (value.compareTo(element) == 0) {
            // How to delete a node in a tree? in java
        }
    }

    public void printTree() {
        if (left != null) {
            left.printTree();
        }
        System.out.println(" " + value + " ");
        if (right != null) {
            right.printTree();
        }

    }

    public static void main( String[] args )
    {
        Node<Character> root = new Node<Character>('a');
        root.insert('b');
        root.insert('c');
        root.insert('d');
        root.printTree();
    }
}
