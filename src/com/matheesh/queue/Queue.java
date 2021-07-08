package com.matheesh.queue;

public class Queue {

    private int[] queueArray;
    private int front;
    private int rear;
    private int items;
    private int maxSize;

    public Queue(int size){
        this.queueArray = new int[size];
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public void push(int element){
        if(rear == maxSize-1){
            System.out.println("Queue is full");
        }
        else {
            rear++;
            queueArray[rear] = element;
            items++;
        }
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

        Queue queue = new Queue(5);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
      //  queue.push(6);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}
