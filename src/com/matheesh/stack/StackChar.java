package com.matheesh.stack;

public class StackChar {

    private char stackArray[];
    private int size;
    private int top = -1;

    public StackChar(){
    }

    public StackChar(int size){
        this.size = size;
        this.stackArray = new char[size];
    }

    public void push(char element){
        if(!isFull()) {
            top++;
            stackArray[top] = element;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public char pop(){
        if(!isEmpty()) {
            char temp = stackArray[top];
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

    public String reverseGivenString(String input){

        int lengthOfString = input.length();
        this.size = lengthOfString;
        stackArray = new char[lengthOfString];
        String resultString = "";
        for(int i = 0; i<lengthOfString; i++){
            push(input.charAt(i));
        }

        while(!isEmpty()) {
            resultString = resultString + pop();
        }

        return resultString;
    }

    public static void main(String args[]){

        StackChar stack = new StackChar();
        System.out.print(stack.reverseGivenString("Matheesh"));

    }
}

