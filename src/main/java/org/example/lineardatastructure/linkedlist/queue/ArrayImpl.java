package org.example.lineardatastructure.linkedlist.queue;

import java.util.Arrays;

public class ArrayImpl {
    private int front=-1,rear=-1;
    private int max=10;
    private int arr[]=new int[max];


    public void insert(int data){
        if(rear==max-1){
            System.out.println("overflow");
        }else{
            if(front==-1 && rear==-1){
                front++;
            }
            rear++;
            arr[rear]=data;

        }
    }

    public void delete(){
        if(front!=-1){
            if(front==max-1){
                front=-1;
                rear=-1;
            }
            front++;
        }
    }

    public void display(){
        int temp=front;
        while(temp!=rear){
            System.out.println(arr[temp]);
            temp++;
        }
        System.out.println(arr[temp]);
    }

}
