package com.DSA.Queue;

public class CircularQueue<T extends Comparable<T>> {
    T[] queue;
    int size;
    int rear;
    int first;

    CircularQueue(int cap) {
        this.queue = (T[]) new Comparable[cap];
    }

    public boolean enQueue(T val) {
        if (size == queue.length) return false;
        queue[rear] = val;
        rear = (rear + 1) % queue.length;
        size++;
        return true;
    }

    public void display() {
        for (int i = first; i < queue.length; i++) {
            System.out.println(queue[i % queue.length]);
        }

    }

    public T deQueue() {
        if (rear == 0) return null;
        T temp = queue[0];
        for (int i = first; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        size--;
        return temp;
    }

}
