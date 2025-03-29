package org.example.linkedlist.doublelist.singular;

import org.example.exception.ResourceNotFoundException;
import org.example.node.DoubleNode;
import org.example.node.Node;

import java.util.Optional;

public class DoubleList<T> implements IDoubleList<T> {
    @Override
    public DoubleNode<T> insertAtBegin(DoubleNode<T> start, DoubleNode<T> newNode) {
        if (start == null) {
            return newNode;
        }
        newNode.next = start;
        start.prev = newNode;
        start = newNode;
        return start;
    }

    @Override
    public DoubleNode<T> insertAtEnd(DoubleNode<T> start, DoubleNode<T> newNode) {
        DoubleNode<T> lastNode = findLastNode(start);
        lastNode.next = newNode;
        newNode.prev = lastNode;
        return start;
    }

    @Override
    public DoubleNode<T> insertAfter(DoubleNode<T> start, T afterThis, DoubleNode<T> newNode) {
        if (start == null) {
            throw new ResourceNotFoundException("head node is null");
        }
        DoubleNode<T> node = findNodeByValue(start, afterThis).orElseThrow(() -> new ResourceNotFoundException("resouce not found"));
        if (node.next == null) {
            node.next = newNode;
            newNode.prev = node;
            return start;
        }
        newNode.next = node.next;
        node.next.prev = newNode;
        node.next = newNode;
        newNode.prev = node;
        return start;
    }

    @Override
    public DoubleNode<T> insertBefore(DoubleNode<T> start, T beforeThis, DoubleNode<T> newNode) {
        if (start.data == beforeThis) {
            newNode.next = start;
            start.prev = newNode;
            return newNode;
        }
        DoubleNode<T> previousNode = findPreviousNodeByValue(start, beforeThis).orElseThrow(() -> new ResourceNotFoundException("node not found before this"));
        newNode.next = previousNode.next;
        previousNode.next.prev = newNode;

        previousNode.next = newNode;
        newNode.prev = previousNode;
        return start;
    }

    @Override
    public void traverseNode(DoubleNode<T> start) {
        DoubleNode<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    @Override
    public Optional<DoubleNode<T>> findNodeByValue(DoubleNode<T> start, T value) {
        DoubleNode temp = start;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return Optional.of(temp);
            }
            temp = temp.next;
        }
        return Optional.empty();
    }

    @Override
    public DoubleNode<T> removeFirstNode(DoubleNode<T> start) {
        if (start == null) {
            throw new ResourceNotFoundException("start node is empty");
        }
        start = start.next;
        start.prev = null;
        return start;
    }

    @Override
    public DoubleNode<T> removeLastNode(DoubleNode<T> start) {
        if (start == null) {
            throw new ResourceNotFoundException("start node is empty");
        }
        if (start.next == null) {
            return null;
        }
        DoubleNode prev = start, ptr = start;
        while (ptr.next != null) {
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = null;
        ptr.prev = null;
        return start;
    }

    @Override
    public DoubleNode<T> removeAfter(DoubleNode<T> start, T afterThis) {
        DoubleNode<T> node = findNodeByValue(start, afterThis).orElseThrow(() -> new ResourceNotFoundException("this value does not found"));
        if (node.next == null) {
            return start;
        }
        DoubleNode ptr = node.next;
        if (ptr.next == null) {
            node.next = ptr.next;
            return start;
        }
        node.next = ptr.next;
        ptr.next.prev = node;
        return start;
    }

    @Override
    public DoubleNode<T> findLastNode(DoubleNode<T> start) {
        if (start.next == null) {
            return start;
        }
        return findLastNode(start.next);
    }

    private Optional<DoubleNode<T>> findPreviousNodeByValue(DoubleNode<T> start, T value) {
        DoubleNode<T> ptr = start, prev = ptr;
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
