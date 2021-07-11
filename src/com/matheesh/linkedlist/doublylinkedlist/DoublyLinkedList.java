package com.matheesh.linkedlist.doublylinkedlist;

public class DoublyLinkedList {

    public Node first;
    public Node last;

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        }
        else{
            first.prev = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first == last) {
            last = null;
        } else {
            first.next.prev = null;
        }

        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;

        if (first.next == null) {
            first = null;
        }
        last.prev.next = null;
        last = last.prev;

        return temp;
    }

    public boolean insertAfter(int key, int data) {

        Node currentNode = first;

        while (currentNode.data != key) {
            currentNode = currentNode.next;
            if (currentNode == null) {
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;
        if (currentNode == last) {
            newNode.next = null;
            last = newNode;
        }else{
            newNode.next = currentNode.next;
            currentNode.next.prev = newNode;
        }
        newNode.prev = currentNode;
        currentNode.next = newNode;
        return true;
    }

    public boolean deleteKey(int key){

        Node currentNode = first;

        if(first == last && first.data == key){
            first = null;
            last = null;
        }

        while(currentNode.data != key){
            currentNode = currentNode.next;
            if(currentNode == null){
                return false;
            }
        }

        if(currentNode == first){
            first = currentNode.next;
        }
        else{
            currentNode.prev.next = currentNode.next;
        }
        if(currentNode == last) {
            last = currentNode.prev;
        }
        else {
            currentNode.next.prev = currentNode.prev;
        }

        return true;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        Node currentNode = first;
        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.next;
        }

    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(10);
        list.insertFirst(11);
        list.insertFirst(12);
        //System.out.println(list.insertAfter(14, 5));
        list.insertLast(13);
        list.insertLast(14);
        list.insertLast(15);
        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(13);
        list.insertAfter(10,100);
        list.insertAfter(14,144);
//        System.out.println(list.deleteKey(12));
        //System.out.println((list.deleteFirst()).data);

        list.displayList();


    }
}
