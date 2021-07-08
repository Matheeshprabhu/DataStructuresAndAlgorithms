package com.matheesh.stack;

public class Stack {

    private int stackArray[];
    private int size;
    private int top = -1;

    public Stack(int size){
        this.size = size;
        this.stackArray = new int[size];
    }

    public void push(int element){
        if(!isFull()) {
            top++;
            stackArray[top] = element;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()) {
            int temp = stackArray[top];
            top--;
            return temp;
        }
        else{
           System.out.println("Stack is empty");
        }
        return 0;
    }

    public int peak(){
        return stackArray[top];
    }

    public void showAll(){

        for(int i = 0; i<=top; i++) {
            System.out.print(stackArray[i] + " ");
        }

    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top==size-1;
    }


    public static void main(String args[]){

        Stack stack = new Stack(5 );

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}

