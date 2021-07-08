package com.matheesh.queue;

public class CircularQueue {

    private int[] queueArray;
    private int front;
    private int rear;
    private int items;
    private int maxSize;

    public CircularQueue(int size){
        this.queueArray = new int[size];
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public void push(int element){
        if(isFull()){
            rear = -1;
        }
            rear++;
            queueArray[rear] = element;
            items++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int temp = queueArray[front];
            front++;
            items--;
            return temp;
        }
    }

    public boolean isFull(){
        return items == maxSize;
    }

    public boolean isEmpty(){
        return items == 0;
    }

    public static void main(String[] args){

        CircularQueue circularQueue = new CircularQueue(3);

        circularQueue.push(1);
        circularQueue.push(2);
        circularQueue.push(3);
        circularQueue.push(4);
        System.out.println(circularQueue.pop());
    }
}
