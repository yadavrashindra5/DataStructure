package org.example.node;

public class DoubleNode<T> {
    public DoubleNode<T> prev;
    public T data;
    public DoubleNode<T> next;

    public DoubleNode(T data) {
        this.data = data;
    }

    public DoubleNode() {
    }
}
