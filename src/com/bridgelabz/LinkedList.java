package com.bridgelabz;




class LinkedList {
    Node node;
    Node tail;
    Node head;

    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            this.node = newnode;
            this.head = newnode;
            this.tail = newnode;
        } else {

            tail.next=newnode;
            tail=newnode;
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
        if(head==null){
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


}
