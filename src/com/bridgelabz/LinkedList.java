package com.bridgelabz;




class LinkedList {
    Node node;
    Node tail;
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.node = newNode;
            this.head = newNode;
            this.tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insert(Node previousNode, int data) {
        if (previousNode == null) {
            System.out.println("previous node can't be empty");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;

    }

    public void pop(){
        if(head == null){
            System.out.println("List is Empty and Can't be delete");
        }
        System.out.println("Deleting the first element");
        head=head.next;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

public void searchNode(int data){
       Node current = head;
        int count = 1;
       boolean flag = false;
    if(head == null) {
        System.out.println("List is empty. Please add input then Search Element");
    }
    else {
        while (current != null) {
            if (current.data == data) {
                flag = true;
                break;
            }
            count = count + 1;
            current = current.next;
        }
    }
    if(flag)
        System.out.println("Element "+data+ " is present in the list at the position : " + count);
    else
        System.out.println("Element is not present in the list");

    }

}
