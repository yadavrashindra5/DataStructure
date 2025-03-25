package org.example.linkedlist.circular;

import org.example.node.Node;

public interface ICircularList<T> {
    Node<T> insertAtBegin(Node<T> start, Node<T> newNode);

    Node<T> insertAtEnd(Node<T> start, Node<T> newNode);

    Node<T> removeFirstNode(Node<T> start);

    Node<T> removeLastNode(Node<T> start);
}
