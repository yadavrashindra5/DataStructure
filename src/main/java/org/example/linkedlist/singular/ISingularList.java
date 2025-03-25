package org.example.linkedlist.singular;

import org.example.node.Node;

import java.util.Optional;

public interface ISingularList<T> {
    Node<T> insertAtBegin(Node<T> start, Node<T> newNode);

    Node<T> insertAtEnd(Node<T> start, Node<T> newNode);

    Node<T> insertAfter(Node<T> start, T afterThis, Node<T> newNode);

    Node<T> insertBefore(Node<T> start, T beforeThis, Node<T> newNode);

    void traverseNode(Node<T> start);

    Node<T> findLastNode(Node<T> start);

    Optional<Node<T>> findNodeByValue(Node<T> start, T value);

    Node<T> removeFirstNode(Node<T> start);

    Node<T> removeLastNode(Node<T> start);

    Node<T> removeAfter(Node<T> start, T afterThis);
}
