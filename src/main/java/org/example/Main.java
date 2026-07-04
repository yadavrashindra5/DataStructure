package org.example;

import org.example.list.CircularLinkedList;
import org.example.list.DoubleCircularLinkedList;
import org.example.list.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
//        DoublyLinkedList<Integer>list=new DoublyLinkedList<>();
//        list.insertAtHead(34);
//        list.insertBeforeNode(12,34);
//        list.insertBeforeNode(35,34);
//        list.insertAfterNode(56,34);
//        list.insertAfterNode(23,12);
//        list.insertAtHead(67);
//        list.insertAtTail(58);
//        list.insertAfterNode(78,58);
//        list.print();

        DoubleCircularLinkedList<Integer>list=new DoubleCircularLinkedList<>();
        list.insertAtHead(34);
        list.insertAtHead(56);
        list.insertAtHead(67);
        list.insertAtHead(45);
        list.insertAtTail(89);
        list.print();

    }
}
