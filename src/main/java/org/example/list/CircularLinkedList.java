package org.example.list;

import org.example.datastructure.Node;

public class CircularLinkedList<T> {
    public Node<T> head;

    public void insertAtBegin(T value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        head=newNode;
        temp.next=head;
    }

    public void insertAtEnd(T value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }

        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    public void deleteFromFirst(){
        if(head==null){
            System.out.println("No element in the list");
            return;
        }else if(head.next==head){
            head=null;
            return;
        }

        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
    }

    public void deleteFromLast(){
        if(head==null){
            System.out.println("No element in the list");
            return;
        }else if(head.next==head){
            head=null;
            return;
        }
        Node prevNode=head,nextNode=head;
        while (nextNode.next!=head){
            prevNode=nextNode;
            nextNode=nextNode.next;
        }
        prevNode.next=head;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node<T> temp=head;
        while (temp.next!=head){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(temp.value);
    }
}
