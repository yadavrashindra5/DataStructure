package org.example.node;

public class SinglyNode <T> extends Node<T> {
    SinglyNode<T> next;
    public SinglyNode(T value) {
        super(value);
    }
}
