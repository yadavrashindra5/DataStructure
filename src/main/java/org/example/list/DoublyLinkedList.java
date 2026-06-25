package org.example.list;

import org.example.node.DoublyNode;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList <T>{
    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public void insertAtHead(T value){
        DoublyNode<T> node=new DoublyNode<T>(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }

        node.next=head;
        head.prev=node;
        head=node;
    }
    public void insertAtTail(T value){
        DoublyNode<T> node=new DoublyNode<>(value);
        if(head==null){
            head=node;
            tail=head;
            return;
        }
        DoublyNode<T> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        tail=node;
    }
    public void insertAfterNode(T value,T afterNode){
        DoublyNode<T>node=new DoublyNode<>(value);
        if (head==null){
            System.out.println("Head is empty");
            return;
        }
        DoublyNode<T>temp=head;
        while (temp!=null && temp.value!=afterNode){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Given node value is not present in the list");
            return;
        }
        if(temp.next==null){
            temp.next=node;
            node.prev=temp;
            tail=node;
        }else{
            node.next=temp.next;
            temp.next.prev=node;
            temp.next=node;
            node.prev=temp;
        }
    }

    public void insertBeforeNode(T value,T beforeNode){
        if(head==null){
            System.out.println("Head is empty");
            return;
        }
        DoublyNode<T> temp=head;
        while (temp!=null && temp.value!=beforeNode){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Given node value is not present in the list");
            return;
        }
        DoublyNode<T>prevNode=temp.prev;
        DoublyNode<T>node=new DoublyNode<>(value);
        if(prevNode==null){
            node.next=temp;
            temp.prev=node;
            head=node;
            return;
        }
        prevNode.next=node;
        node.prev=prevNode;
        node.next=temp;
        temp.prev=node;

    }

    public void removeHead(){
        if (head==null){
            System.out.println("Head is already Empty");
            return;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }else{
            head.prev=null;
        }
    }
    public void removeTail(){
        if (head==null){
            System.out.println("Head is already Empty");
            return;
        }
        if(tail.prev==null){
            head=null;
            tail=null;
            return;
        }
        DoublyNode<T>prevNode=tail.prev;
        tail.prev=null;
        prevNode.next=null;
        tail=prevNode;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void print(){
        DoublyNode<T> tail=head;
        while (tail!=null){
            System.out.print(tail.value+" ");
            tail=tail.next;
        }
    }

    public List<T> toList() {
        List<T> result = new ArrayList<>();

        DoublyNode<T> temp = head;

        while (temp != null) {
            result.add(temp.value);
            temp = temp.next;
        }

        return result;
    }

    public int size() {
        int count = 0;
        DoublyNode<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
