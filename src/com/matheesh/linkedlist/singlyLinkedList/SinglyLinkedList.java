package com.matheesh.linkedlist.singlyLinkedList;

public class SinglyLinkedList {

    public Node first;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNodeAddress = first;
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        Node currentNode = first;
        while(currentNode.nextNodeAddress != null){
            currentNode = currentNode.nextNodeAddress;
        }
        currentNode.nextNodeAddress = newNode;
    }

    public void deleteFirst(){
        Node temp = first.nextNodeAddress;
        first = temp;
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

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(11);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertLast(100);
        list.deleteFirst();

        list.displayList();
        System.out.println("list length --> " + list.length());
    }

}

