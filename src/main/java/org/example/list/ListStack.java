package org.example.list;

import org.example.node.SinglyNode;

public class ListStack {
    private SinglyNode head=null;
    private SinglyNode tail=null;

    public void push(int value){
        SinglyNode node=new SinglyNode(value);
        if (head==null){
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;
    }
    public void pop(){
        if (head==null){
            System.out.println("Stack is Empty");
            return;
        }
        SinglyNode temp=head;
        SinglyNode temp1=head;
        while(temp.next!=null){
            temp1=temp;
            temp=temp.next;
        }
        tail=temp1;
        tail.next=null;
        if(head==tail){
            head=null;
        }
    }

    public void peek(){
        if (head==null){
            System.out.println("Stack is Empty");
            return;
        }
        SinglyNode temp=head;
        while(temp!=tail){
            temp=temp.next;
        }
        System.out.println(temp.value);
    }

    public void display(){
        SinglyNode temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
