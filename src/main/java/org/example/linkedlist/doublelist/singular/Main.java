package org.example.linkedlist.doublelist.singular;

import org.example.node.DoubleNode;

public class Main {
    public static void main(String[] args) {
        IDoubleList<Integer> doubleList = new DoubleList<>();
        DoubleNode<Integer> start = null;

        start = doubleList.insertAtBegin(start, new DoubleNode<>(89));
        start = doubleList.insertAtBegin(start, new DoubleNode<>(78));
        start = doubleList.insertAtEnd(start, new DoubleNode<>(8977));
        start = doubleList.insertAfter(start, 8977, new DoubleNode<>(200));
        doubleList.traverseNode(start);
        System.out.println("ghjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        start=doubleList.removeFirstNode(start);
        doubleList.traverseNode(start);
    }

}
