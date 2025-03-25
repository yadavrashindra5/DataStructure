package org.example.linkedlist.circular;

import org.example.node.Node;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CircularListImplTest {
    private Node<Integer> start = null;
    private ICircularList<Integer> list = new CircularListImpl<>();

    @Test
    void insertAtBegin() {
        start = list.insertAtBegin(start, new Node<>(90));
        start = list.insertAtBegin(start, new Node<>(190));
        start = list.insertAtBegin(start, new Node<>(930));
        assertEquals(930, start.data);
        System.out.println("Test passed");
    }

    @Test
    void insertAtEnd() {
        start = list.insertAtEnd(start, new Node<>(765));
        Node lastNode = getLastNode(start);
        assertEquals(765, lastNode.data);
        System.out.println("Test case passed insert at end");
    }

    @Test
    void removeFirstNode() {
    }

    @Test
    void removeLastNode() {
    }

    private Node getLastNode(Node start) {
        Node temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }
        return temp;
    }

    private Node getSecondLastNode(Node start) {
        Node prevNode = start, nextNode = start;
        while (nextNode.next != start) {
            prevNode = nextNode;
            nextNode = nextNode.next;
        }
        return prevNode;
    }
}