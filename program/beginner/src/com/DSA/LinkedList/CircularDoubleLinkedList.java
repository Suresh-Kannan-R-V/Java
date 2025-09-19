package com.DSA.LinkedList;

public class CircularDoubleLinkedList<T extends Comparable<T>> {
    Node head;
    int size = 0;

    class Node {
        T val;
        Node prev;
        Node next;

        Node(T val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    public void add(T val) {
        if (head == null) {
            head = new Node(val);
            head.next = head;
            head.prev = head;
        } else {
            Node newNode = new Node(val);
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = head;
            head.prev = newNode;

        }
        size++;
    }

    public void addFirst(T val) {
        if (head == null) {
            head = new Node(val);
            head.next = head;
            head.prev = head;
        } else {
            Node newNode = new Node(val);
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = head;
            head.prev = newNode;
            head = head.prev;
        }
        size++;
    }


    public void display() {
        if (head == null) return;
        Node start = head;
        do {
            System.out.print(start.val + " -> ");
        } while ((start = start.next) != head);
    }
}
