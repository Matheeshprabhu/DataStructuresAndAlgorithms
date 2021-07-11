package com.matheesh.linkedlist.singlyLinkedList;

public class CircularLinkedList {

    public Node first;
    public Node last;

    public void insertFirst(int data){
        Node newNode = new Node();
        if(isEmpty()){
            last = newNode;
        }
        newNode.data = data;
        newNode.nextNodeAddress = first;
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        }
        last.nextNodeAddress = newNode;
        last = newNode;
    }

    public void deleteFirst(){
        Node temp = first.nextNodeAddress;
        if(first.nextNodeAddress == null){
            last = null;
        }
        first = temp;
    }

    public void deleteLast(){
        Node prevCurrentNode = null;
        Node currentNode = first;

        while(currentNode.nextNodeAddress != null){
            prevCurrentNode = currentNode;
            currentNode = currentNode.nextNodeAddress;
        }
        last = prevCurrentNode;
        prevCurrentNode.nextNodeAddress = null;

    }


    public void displayList(){
        Node currentNode = first;

        while(currentNode != null){
            currentNode.display();
            currentNode = currentNode.nextNodeAddress;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int length(){

        int length = 0;
        Node currentNode = first;

        while(currentNode != null){
            length++;
            currentNode = currentNode.nextNodeAddress;
        }

        return length;

    }

    public static void main(String[] args){

        CircularLinkedList list = new CircularLinkedList();

        list.insertFirst(11);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertLast(15);
        list.deleteLast();

//        list.deleteFirst();

        list.displayList();
       // System.out.println("list length --> " + list.length());
    }
}
