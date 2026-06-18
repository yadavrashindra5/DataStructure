package org.example.datastructure;

public interface ILinkedList<T> {
    void insertAtBegin(T value);

    void insertAtEnd(T value);

    void insertAfter(T value, T nodeValue);

    void insertBefore(T value, T nodeValue);

    void deleteFirstNode();

    void deleteLastNode();

    void deleteAfter(T value);

    void printList();

    boolean isEmpty();
}
