package com.DSA.trickyQuestions;

import java.util.*;

public class StackUsingQueue {
    public static void main(String[] args) {
        QueueToStack1<Integer> qs = new QueueToStack1<>();
        qs.push(10);
        qs.push(20);
        qs.push(30);
        qs.push(40);
        qs.push(50);
        qs.diaplay();
        System.out.println(qs.pop());
        System.out.println(qs.pop());
        qs.diaplay();
    }
}

// Method 1 to O(n) in Push
class QueueToStack1<T> {
    Queue<T> queue1 = new LinkedList<>();
    Queue<T> queue2 = new LinkedList<>();

    public boolean push(T val) {
        queue2.add(val);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }

        return true;
    }

    public T pop() {
        if (queue1.isEmpty()) return null;

        return queue1.poll();
    }

    public T peek() {
        if (queue1.isEmpty()) return null;

        return queue1.peek();
    }

    public void diaplay() {
        if (queue1.isEmpty()) return;

        for (T val : queue1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

class QueueToStack2<T> {
    LinkedList<T> queue1 = new LinkedList<>();

    public boolean push(T val) {
        queue1.addFirst(val);
        return true;
    }

    public T pop() {
        return queue1.removeFirst();
    }

    public T peek() {
        return queue1.peek();
    }
}