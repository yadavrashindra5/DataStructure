package org.example;


import org.example.linkedlist.singular.ISingularList;
import org.example.linkedlist.singular.SingularListImpl;
import org.example.node.Node;

public class Main {
    public static void main(String[] args) {
        Node<Integer> start = null;
        ISingularList<Integer> singularList = new SingularListImpl<>();
        start = singularList.insertAtBegin(start, new Node<>(90));
//        start = singularList.insertAtBegin(start, new Node<>(9));
//        start = singularList.insertAtEnd(start, new Node<>(87));
//        start = singularList.insertAtBegin(start, new Node<>(10));
//        start = singularList.insertAtBegin(start, new Node<>(11));
        start = singularList.insertBefore(start, 90, new Node<>(91));
        start = singularList.insertAfter(start, 90, new Node<>(92));
        start = singularList.insertAtBegin(start, new Node<>(911));
        singularList.traverseNode(start);
    }
}