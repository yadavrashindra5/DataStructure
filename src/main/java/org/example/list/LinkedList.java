package org.example.list;

import org.example.datastructure.ILinkedList;
import org.example.datastructure.Node;

public class LinkedList<T> implements ILinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size=0;
    @Override
    public void insertAtBegin(T value) {
        Node<T> node=new Node<T>(value);
        if(head==null){
            head=tail=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }

    @Override
    public void insertAtEnd(T value) {
        Node<T> node=new Node<T>(value);
        if(head==null){
            head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    @Override
    public void insertAfter(T value, T nodeValue) {
        if (head==null){
            System.out.println("List is null not possible to insert new node");
            return;
        }
        Node ptr=head;
        while (ptr!=null){
            if(ptr.value==nodeValue){
                Node<T>newNode=new Node<>(value);
                newNode.next=ptr.next;
                ptr.next=newNode;
                if(ptr==tail){
                    System.out.println("HHHHHHH");
                    tail=newNode;
                }
                return;
            }
            ptr=ptr.next;
        }
        System.out.println("Given node value does not fouund");
    }

    @Override
    public void insertBefore(T value, T nodeValue) {
        if (head==null){
            System.out.println("List is null not possible to insert new node");
            return;
        }
        if(head.value==nodeValue){
            Node newNode=new Node(value);
            newNode.next=head;
            head=newNode;
            return;
        }
        Node ptr=head,prePtr=head;
        while (ptr!=null){
            if(ptr.value==nodeValue){
                Node newNode=new Node(value);
                newNode.next=ptr;
                prePtr.next=newNode;
                return;
            }
            prePtr=ptr;
            ptr=ptr.next;
        }
        System.out.println("Given node value does not fouund");
    }

    @Override
    public void deleteFirstNode() {
        if(head==null){
            System.out.println("List is null");
            return;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
    }

    @Override
    public void deleteLastNode() {
        if(head==null){
            System.out.println("List is null");
            return;
        }
        Node ptr=head,prePtr=head;
        while (ptr.next!=null){
            prePtr=ptr;
            ptr=ptr.next;
        }
        prePtr.next=null;
        tail=prePtr;
    }

    @Override
    public void deleteAfter(T value) {
        if(head==null){
            System.out.println("List is null");
            return;
        }
        if(head.value==value){
            head=head.next;
            if(head==null){
                tail=null;
            }
            return;
        }
        Node ptr=head,prePtr=head;
        while (ptr!=null){
            if(prePtr.value==value){
                prePtr.next=ptr.next;
                if(ptr==tail){
                    tail=prePtr;
                }
                return;
            }
            prePtr=ptr;
            ptr=ptr.next;
        }
    }

    @Override
    public void printList() {
        Node<T> temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

}
