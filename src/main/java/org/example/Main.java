package org.example;

import org.example.list.ArrayStack;
import org.example.list.ListStack;

public class Main {
    public static void main(String[] args) {
        ListStack stack=new ListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
    }
}
