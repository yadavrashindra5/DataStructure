package org.example.lineardatastructure.linkedlist;

public interface LinkedList<T> {
    Node<T> insertAtBegin(T data, Node<T> start);

    Node<T> insertAtEnd(T data, Node<T> start);

    Node<T> insertAfter(T data, T after, Node<T> start);

    Node<T> insertBefore(T data, T before, Node<T> start);

    void display(Node<T> start);

    Node<T> deleteFirstNode(Node<T> start);

    Node<T> deleteLastNode(Node<T> start);

    Node<T> deleteAfter(T after, Node<T> start);

    Node<T> deleteBefore(T before, Node<T> start);
}
