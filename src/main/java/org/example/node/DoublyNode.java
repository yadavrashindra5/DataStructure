package org.example.node;

public class DoublyNode <T> extends Node<T> {
    public DoublyNode<T> prev;
    public DoublyNode<T> next;
    public DoublyNode(T value) {
        super(value);
    }
}
