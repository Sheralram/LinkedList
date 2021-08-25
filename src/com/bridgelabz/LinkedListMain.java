package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List");
        LinkedList list=new LinkedList();
        list.add(56);
        list.add(70);
        list.insert(list.head, 30);
        list.display();
    }
}
