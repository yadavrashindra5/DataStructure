package org.example.linkedlist.circular;

import org.example.node.Node;

import java.util.ArrayList;
import java.util.List;

public class CircularListImpl<T> implements ICircularList<T> {
    @Override
    public Node<T> insertAtBegin(Node<T> start, Node<T> newNode) {
        if (start == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node<T> lastNode = getLastNode(start);
        lastNode.next = newNode;
        newNode.next = start;
        return newNode;
    }

    @Override
    public Node<T> insertAtEnd(Node<T> start, Node<T> newNode) {
        if (start == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node<T> lastNode = getLastNode(start);
        lastNode.next = newNode;
        newNode.next = start;
        return start;
    }

    @Override
    public Node<T> removeFirstNode(Node<T> start) {
        if (start == null) {
            throw new IllegalArgumentException("start node is null");
        }
        Node<T> lastNode = getLastNode(start);
        lastNode.next = start;
        return start;
    }

    @Override
    public Node<T> removeLastNode(Node<T> start) {
        if (start == null) {
            throw new IllegalArgumentException("start node is null");
        }
        Node<T> secondLastNode = getSecondLastNode(start);
        secondLastNode.next = start;
        return start;
    }

    private Node<T> getLastNode(Node<T> start) {
        Node<T> temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }
        return temp;
    }

    private Node<T> getSecondLastNode(Node<T> start) {
        Node<T> prevNode = start, nextNode = start;
        while (nextNode.next != start) {
            prevNode = nextNode;
            nextNode = nextNode.next;
        }
        return prevNode;
    }
}
