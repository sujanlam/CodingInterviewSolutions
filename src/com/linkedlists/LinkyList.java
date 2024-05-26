package com.linkedlists;

public class LinkyList {
    Node head;

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void insertAtEnd(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n1;

        }
    }
    void addToStart(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    void addNodeAfter(int after, int data){
        Node current = head;
        Node n1 = new Node(data);

        while (current != null){
            if(current.data == after){
                n1.next = current.next;
                current.next = n1;
                break;
            }

            current = current.next;
        }

    }

}
