package org.example.lineardatastructure.linkedlist.stack;

import java.util.Arrays;

public class ArrayImpl<T> {
    private int max=10;
    private int stack[]=new int[10];
    private int top=-1;
    public void push(int data){
        if(top==max-1) {
            System.out.println("Stack is overflow");
        }
        else if(top!=max-1){
            stack[++top]=data;
        }
    }

    public void display(){
        int i=0;
        while(i<=top){
            System.out.print(stack[i]+" ");
            i++;
        }
    }

}
