package org.example.lineardatastructure.linkedlist;

public interface LinkedList<T> {
    Node<T> insertAtBegin(T data,Node<T> start);
    Node<T> insertAtEnd (T data,Node<T> start);
    Node<T> insertAfter(T data,Node<T> start);
    Node<T> insertBefore(T data,Node<T> start);
    void display(Node<T> start);
    void deleteFirstNode(Node<T> start);
    void deleteLastNode(Node<T> start);
    void deleteAfter(T data,Node<T> start);
    void deleteBefore(T data,Node<T> start);
}
