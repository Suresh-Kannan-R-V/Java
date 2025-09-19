package com.DSA.Queue;

public class arrayQueue<T extends Comparable<T>> {
    T[] queue;
    int size;
    int rear;

    arrayQueue(int cap) {
        this.queue = (T[]) new Comparable[cap];
        this.size = 0;
        this.rear = 0;
    }

    public boolean enQueue(T val) {
        if (rear == queue.length) return false;
        else {
            queue[rear++] = val;
            size++;
            return true;
        }
    }

    public T deQueue() {
        if (rear == 0) return null;
        T temp = queue[0];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        size--;
        return temp;
    }

    public T peek() {
        if (rear == 0) return null;
        return queue[0];
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

}
