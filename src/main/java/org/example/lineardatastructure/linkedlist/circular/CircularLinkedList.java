package org.example.lineardatastructure.linkedlist.circular;

import org.example.lineardatastructure.linkedlist.LinkedList;
import org.example.lineardatastructure.linkedlist.Node;

public class CircularLinkedList<T> implements LinkedList<T> {
    @Override
    public Node<T> insertAtBegin(T data, Node<T> start) {
        Node<T>newNode=new Node<>(data);
        if(start==null){
            start=newNode;
            newNode.next=start;
        }
        else {
            Node<T>temp=start;
            while (temp.next!=start){
                temp=temp.next;
            }
            newNode.next=start;
            start=newNode;
            temp.next=start;
        }
        return start;
    }

    @Override
    public Node<T> insertAtEnd(T data, Node<T> start) {
        Node<T>newNode=new Node<>(data);
        if(start==null){
            start=newNode;
            newNode.next=start;
        }
        else {
            Node<T>temp=start;
            while (temp.next!=start){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=start;
        }
        return start;
    }

    @Override
    public Node<T> insertAfter(T data, T after, Node<T> start) {
        return null;
    }

    @Override
    public Node<T> insertBefore(T data, T before, Node<T> start) {
        return null;
    }

    @Override
    public void display(Node<T> start) {
        Node<T>temp=start;
        while (temp.next!=start){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    @Override
    public Node<T> deleteFirstNode(Node<T> start) {
        return null;
    }

    @Override
    public Node<T> deleteLastNode(Node<T> start) {
        return null;
    }

    @Override
    public Node<T> deleteAfter(T after, Node<T> start) {
        return null;
    }

    @Override
    public Node<T> deleteBefore(T before, Node<T> start) {
        return null;
    }
}
