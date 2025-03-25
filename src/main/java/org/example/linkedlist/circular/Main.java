package org.example.linkedlist.circular;

import org.example.node.Node;

public class Main {
    public static void main(String[] args) {
        Node<Integer> start = null;
        ICircularList<Integer> iCircularList = new CircularListImpl<>();
        start = iCircularList.insertAtBegin(start, new Node<>(89));
        start = iCircularList.insertAtBegin(start, new Node<>(67));
        start = iCircularList.insertAtBegin(start, new Node<>(637));

        System.out.println(start.data + " " + start.next.data);
    }
}
