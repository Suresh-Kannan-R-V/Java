package com.DSA.Queue;

import com.DSA.Queue.arrayQueue;
import com.DSA.Queue.LinkedQueue;
import com.DSA.Queue.CircularQueue;

public class queue {
    public static void main(String[] args) {
//        arrayQueue<Integer> q = new arrayQueue<>(10);

//        q.enQueue(10);
//        q.enQueue(20);
//        q.enQueue(30);
//        q.enQueue(40);
//        q.enQueue(50);
//        q.enQueue(60);
//        System.out.println(q.deQueue());
//        q.display();
        CircularQueue<Integer> q = new CircularQueue<>(4);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.display();

//
    }
}
