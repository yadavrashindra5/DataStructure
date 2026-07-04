package org.example.list;

import org.example.node.DoublyNode;

public class DoubleCircularLinkedList<T> {
    public DoublyNode<T> start;

    public void insertAtHead(T value){
        DoublyNode<T> newNode=new DoublyNode<>(value);
        if(start==null){
            start=newNode;
            start.prev=newNode;
            start.next=newNode;
            return;
        }
        DoublyNode<T>prevNode=start.prev;
        newNode.next=start;
        start.prev=newNode;
        prevNode.next=newNode;
        newNode.prev=prevNode;
        start=newNode;
    }

    public void  insertAtTail(T value){
        DoublyNode<T> newNode=new DoublyNode<>(value);
        if(start==null){
            start=newNode;
            start.prev=newNode;
            start.next=newNode;
            return;
        }
        DoublyNode<T> lastNode=start.prev;
        lastNode.next=newNode;
        newNode.prev=lastNode;
        newNode.next=start;
        start.prev=newNode;
    }

    public void removeHead(){

    }

    public void  removeTail(){

    }

    public void print(){
        if (start==null){
            System.out.println("Doubly Circular linked list is empty");
            return;
        }
        DoublyNode<T>dummyNode=start;
        do {
            System.out.print(dummyNode.value+" ");
            dummyNode=dummyNode.next;
        }while (dummyNode!=start);
    }
}
