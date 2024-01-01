package org.example;

import org.example.lineardatastructure.linkedlist.Node;
import org.example.lineardatastructure.linkedlist.singly.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        Node<Integer>start = null;
        SingleLinkedList<Integer>singleLinkedList=new SingleLinkedList<>();
        start=singleLinkedList.insertAtBegin(89,start);
        start=singleLinkedList.insertAtBegin(9,start);
        start=singleLinkedList.insertAtEnd(90,start);
        start=singleLinkedList.insertAtBegin(11,start);
        start=singleLinkedList.insertAfter(91,89,start);
        start=singleLinkedList.insertAfter(100,91,start);
        start=singleLinkedList.insertBefore(10,11,start);
//        start=singleLinkedList.deleteFirstNode(start);
        start=singleLinkedList.deleteBefore(89,start);
        start=singleLinkedList.deleteBefore(89,start);
        start=singleLinkedList.deleteBefore(89,start);
        start=singleLinkedList.deleteBefore(100,start);
        start=singleLinkedList.deleteBefore(100,start);
        start=singleLinkedList.deleteBefore(90,start);
        start=singleLinkedList.deleteBefore(100,start);
        singleLinkedList.display(start);
    }
}