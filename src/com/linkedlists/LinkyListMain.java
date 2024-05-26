package com.linkedlists;

public class LinkyListMain {
    public static void main(String[] args) {
        LinkyList linkyList = new LinkyList();
        linkyList.insertAtEnd( 4);
        linkyList.insertAtEnd( 3);
        linkyList.addToStart(45);
        linkyList.addNodeAfter(4, 77);
        linkyList.print();

    }
}
