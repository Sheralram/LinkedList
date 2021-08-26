package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List");
        System.out.println("Nodes of singly linked list:");
        LinkedList list=new LinkedList();
        list.addNode(56);
        list.addNode(70);
        list.displayNode();
        System.out.println("30 is Inserting between 56 and 70");
        list.insertNode(list.head, 30);
        list.displayNode();
//        list.popNode();
//        list.displayNode();
        list.searchNode(30);
        list.displayNode();
        System.out.println("40 is Inserting after 30 ");
        list.insertNode(list.head.next, 40);
        list.displayNode();
        list.searchNode(40);
        list.displayNode();
        System.out.println("40 is Deleted  ");
        list.deleteNode(40);
        list.displayNode();
        list.size();
        
    }
}
