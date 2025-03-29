package org.example.linkedlist.doublelist.singular;

import org.example.node.DoubleNode;

import java.util.Optional;

public interface IDoubleList<T> {
    public DoubleNode<T> insertAtBegin(DoubleNode<T> start, DoubleNode<T> newNode);

    public DoubleNode<T> insertAtEnd(DoubleNode<T> start, DoubleNode<T> newNode);

    public DoubleNode<T> insertAfter(DoubleNode<T> start, T afterThis, DoubleNode<T> newNode);

    public DoubleNode<T> insertBefore(DoubleNode<T> start, T beforeThis, DoubleNode<T> newNode);

    public void traverseNode(DoubleNode<T> start);

    public DoubleNode<T> findLastNode(DoubleNode<T> start);

    public Optional<DoubleNode<T>> findNodeByValue(DoubleNode<T> start, T value);

    public DoubleNode<T> removeFirstNode(DoubleNode<T> start);

    public DoubleNode<T> removeLastNode(DoubleNode<T> start);

    public DoubleNode<T> removeAfter(DoubleNode<T> start, T afterThis);
}
