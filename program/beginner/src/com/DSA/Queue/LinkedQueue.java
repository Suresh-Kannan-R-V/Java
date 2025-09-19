package com.DSA.Queue;

public class LinkedQueue<T extends Comparable<T>> {
    Node head;
    Node tail;
    int size;

    class Node {

        T val;
        Node next;

        Node(T val) {
            this.val = val;
            this.next = null;
        }
    }


    public boolean enQueue(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    public T deQueue() {
        if (head == null) return null;
        T temp = head.val;
        head = head.next;
        size--;
        return temp;
    }

    public void display() {
        Node start = head;
        while (start != null) {
            System.out.print(start.val + " ");
            start = start.next;
        }
        System.out.println();
    }

    public T peek() {
        if (head == null) return null;
        return head.val;
    }

    public int size() {
        return size;
    }
}
