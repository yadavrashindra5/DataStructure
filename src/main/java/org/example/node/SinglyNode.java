package org.example.node;

public class SinglyNode <T> extends Node<T> {
    public SinglyNode<T> next;
    public SinglyNode(T value) {
        super(value);
    }
}
