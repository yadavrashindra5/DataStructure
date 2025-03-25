package org.example.node;


public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T value) {
        this.data = value;
    }

    public Node() {
    }

}
