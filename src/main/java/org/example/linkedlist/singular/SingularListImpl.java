package org.example.linkedlist.singular;

import org.example.exception.ResourceNotFoundException;
import org.example.node.Node;

import java.util.Optional;

public class SingularListImpl<T> implements ISingularList<T> {
    @Override
    public Node<T> insertAtBegin(Node<T> start, Node<T> newNode) {
        if (newNode == null) {
            throw new IllegalArgumentException("new node can't be null");
        }
        newNode.next = start;
        return newNode;
    }

    @Override
    public Node<T> insertAtEnd(Node<T> start, Node<T> newNode) {
        if (start == null) {
            return newNode;
        }
        if (newNode == null) {
            throw new IllegalArgumentException("new node can't be null");
        }
        Node<T> lastNode = findLastNode(start);
        lastNode.next = newNode;
        return start;
    }

    @Override
    public Node<T> insertAfter(Node<T> start, T afterThis, Node<T> newNode) {
        Node<T> nodeOfValue = findNodeByValue(start, afterThis).orElseThrow(() -> new ResourceNotFoundException("provide value did present in the list"));
        newNode.next = nodeOfValue.next;
        nodeOfValue.next = newNode;
        return start;
    }

    @Override
    public Node<T> insertBefore(Node<T> start, T beforeThis, Node<T> newNode) {
        if (start.data == beforeThis) {
            newNode.next = start;
            return newNode;
        }
        Node<T> previousNode = findPreviousNodeByValue(start, beforeThis).orElseThrow(() -> new ResourceNotFoundException("provide value did present in the list"));
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        return start;
    }

    @Override
    public void traverseNode(Node<T> start) {
        Node<T> ptr = start;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
    }

    @Override
    public Node<T> findLastNode(Node<T> start) {
        Node<T> ptr = start;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        return ptr;
    }

    @Override
    public Node<T> removeFirstNode(Node<T> start) {
        if (start == null) {
            throw new ResourceNotFoundException("list is empty");
        }
        start = start.next;
        return start;
    }

    @Override
    public Node<T> removeLastNode(Node<T> start) {
        if (start == null) {
            throw new ResourceNotFoundException("list is empty");
        }
        Node<T> ptr = start, prev = ptr;
        while (ptr.next != null) {
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = null;
        return start;
    }

    @Override
    public Node<T> removeAfter(Node<T> start, T afterThis) {
        if (start == null) {
            throw new ResourceNotFoundException("list is empty");
        }
        Node<T> nodeByValue = findNodeByValue(start, afterThis).orElseThrow(() -> new ResourceNotFoundException("List does have this value"));
        nodeByValue.next = nodeByValue.next != null ? nodeByValue.next.next : null;
        return start;
    }

    @Override
    public Optional<Node<T>> findNodeByValue(Node<T> start, T value) {
        Node<T> ptr = start;
        while (ptr != null) {
            if (ptr.data.equals(value)) {
                return Optional.of(ptr);
            }
            ptr = ptr.next;
        }
        return Optional.empty();
    }

    private Optional<Node<T>> findPreviousNodeByValue(Node<T> start, T value) {
        Node<T> ptr = start, prev = ptr;
        while (ptr != null) {
            if (ptr.data.equals(value)) {
                return Optional.of(prev);
            }
            prev = ptr;
            ptr = ptr.next;
        }
        return Optional.empty();
    }

}
