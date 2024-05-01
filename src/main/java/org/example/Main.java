package org.example;

import org.example.lineardatastructure.linkedlist.Node;
import org.example.lineardatastructure.linkedlist.circular.CircularLinkedList;
import org.example.lineardatastructure.linkedlist.singly.SingleLinkedList;
import org.example.lineardatastructure.linkedlist.stack.ArrayImpl;

import java.util.ArrayList;
import java.util.List;

interface Person{
    int x=20;

}


class Student implements  Person{

}

public class Main {
    public static void main(String[] args) {
//        Node<Integer>start = null;
//        CircularLinkedList<Integer>circularLinkedList=new CircularLinkedList<>();
//        start=circularLinkedList.insertAtEnd(100,start);
//        start=circularLinkedList.insertAtBegin(67,start);
//        start=circularLinkedList.insertAtBegin(45,start);
//        start=circularLinkedList.insertAtBegin(32,start);
//        start=circularLinkedList.insertAtBegin(76,start);
//        start=circularLinkedList.insertAtBegin(89,start);
//        start=circularLinkedList.insertAtBegin(65,start);
//        start=circularLinkedList.insertAtBegin(35,start);
//        start=circularLinkedList.insertAtEnd(50,start);
//        circularLinkedList.display(start);

//        ArrayImpl array=new ArrayImpl();
//        array.push(789);
//        array.display();
        Person student=new Student();
        System.out.println(student.x);
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
    }
}