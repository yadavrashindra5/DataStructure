package org.example.lineardatastructure.linkedlist.doublelinkedlist;

public class DoubleLinkedList {
    public Node insertAtBegin(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        head.previous=newNode;
        newNode.next=head;
        head=newNode;
        return head;
    }

    public Node insertAtLast(Node head,int data){
        Node newNode=new Node(data);
        Node ptr=head;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        newNode.previous=ptr;
        return head;
    }

    public Node insertBefore(Node head,int data,int beforeElement){
        return null;
    }

    public Node insertAfter(Node head,int data,int afterElement){
        return null;
    }

    public void display(Node head){
        Node ptr=head;
        while (ptr!=null){
            System.out.println(ptr.data+" ");
            ptr=ptr.next;
        }
    }
}
