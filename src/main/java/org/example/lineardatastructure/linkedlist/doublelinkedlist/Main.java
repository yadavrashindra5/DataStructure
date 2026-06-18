package org.example.lineardatastructure.linkedlist.doublelinkedlist;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        Node head=null;
        head=doubleLinkedList.insertAtBegin(head,89);
        head=doubleLinkedList.insertAtBegin(head,90);
        head=doubleLinkedList.insertAtLast(head,87);
        doubleLinkedList.display(head);
    }
}
