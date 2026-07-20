package org.example.list;

public class ArrayStack {
    private int index=-1;
    private int[] stack;
    private int size;
    public ArrayStack(int size){
        this.size=size;
        stack=new int[size];
    }

    public void push(int value){
        if(index==size-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++index]=value;
    }
    public int pop(){
        if(index==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[index--];
    }
    public int peek(){
        if(index==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[index];
    }
}
