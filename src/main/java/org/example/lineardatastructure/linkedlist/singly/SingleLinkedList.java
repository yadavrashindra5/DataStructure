package org.example.lineardatastructure.linkedlist.singly;

import org.example.lineardatastructure.linkedlist.LinkedList;
import org.example.lineardatastructure.linkedlist.Node;

public class SingleLinkedList<T> implements LinkedList<T> {
    @Override
    public Node<T> insertAtBegin(T data, Node<T> start) {
        Node<T> newNode = new Node<>(data);
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
        return start;
    }

    @Override
    public Node<T> insertAtEnd(T data, Node<T> start) {
        Node<T> newNode = new Node<>(data);
        if (start == null) {
            start = newNode;
        } else {
            Node<T> temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return start;
    }

    @Override
    public Node<T> insertAfter(T data, T after, Node<T> start) {
        if (start == null) {
            System.out.println("Linked List is empty insert some node first");
        } else {
            Node<T> temp = start;
            while (temp.data != after) {
                temp = temp.next;
            }
            Node<T> newNode = new Node<>(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return start;
    }

    @Override
    public Node<T> insertBefore(T data, T before, Node<T> start) {
        if (start == null) {
            System.out.println("Linked List is empty insert some node first");
        } else {
            if (start.data == before) {
                start = insertAtBegin(data, start);
            } else {
                Node<T> temp = start;
                Node<T> prev = start;
                while (temp != null && temp.data != before) {
                    prev = temp;
                    temp = temp.next;
                }
                if (temp == null) {
                    System.out.println("There is no element called before");
                } else {
                    Node<T> newNode = new Node<>(data);
                    newNode.next = temp;
                    prev.next = newNode;
                }
            }
        }
        return start;
    }

    @Override
    public void display(Node<T> start) {
        if (start == null) {
            System.out.println("There is not data in linked list");
        } else {
            Node<T> temp = start;
            StringBuilder result = new StringBuilder();
            while (temp != null) {
                result.append(temp.data);
                if (temp.next != null) {
                    result.append("-");
                }
                temp = temp.next;
            }
            System.out.println(result);
        }
    }

    @Override
    public Node<T> deleteFirstNode(Node<T> start) {
        if (start == null) {
            System.out.println("There is no node present");
        } else {
            start = start.next;
        }
        return start;
    }

    @Override
    public Node<T> deleteLastNode(Node<T> start) {
        if (start == null) {
            System.out.println("There is no node present");
        } else {
            Node<T> temp = start, prev = start;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == prev) {
                start = null;
            } else {
                prev.next = null;
            }
        }
        return start;
    }

    @Override
    public Node<T> deleteAfter(T after, Node<T> start) {
        if (start == null) {
            System.out.println("There is no node present");
        } else {
            Node<T> temp = start, prev = start;
            while (temp.data != after) {
                prev = temp;
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        return start;
    }

    @Override
    public Node<T> deleteBefore(T before, Node<T> start) {
        if (start == null) {
            System.out.println("There is no node present");
        } else {
            Node<T> temp = start, prev = start;
            while (temp.next!=null&&temp.next.data != before) {
                prev = temp;
                temp = temp.next;
            }
            if(prev==temp){
                start=start.next;
            }
            else {
                prev.next=temp.next;
            }
        }
        return start;
    }
}
