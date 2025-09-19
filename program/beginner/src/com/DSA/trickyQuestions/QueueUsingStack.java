package com.DSA.trickyQuestions;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        StackToQueue1<Integer> sq = new StackToQueue1<>();
        sq.enQueue(10);
        sq.enQueue(20);
        sq.enQueue(30);
        sq.enQueue(40);
        sq.enQueue(50);
        sq.display();
        System.out.println(sq.deQueue());
        sq.display();
        System.out.println(sq.deQueue());
        System.out.println(sq.deQueue());
        sq.enQueue(60);
        sq.enQueue(70);
        sq.display();


    }
}

//Method 1 (Time consume for Enqueue)
class StackToQueue1<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public boolean enQueue(T val) {
        if (stack1.isEmpty()) {
            stack1.push(val);
            return true;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(val);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return true;
    }

    public T deQueue() {
        return stack1.pop();
    }

    public T peek() {
        return stack1.peek();
    }

    public void display() {
        if (stack1.isEmpty()) return;
        for (int i = stack1.size() - 1; i >= 0; i--) {
            System.out.print(stack1.get(i) +" ");
        }
        System.out.println();
    }
}


//Method 2 (Time consume for Dequeue)
class StackToQueue2<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public boolean enQueue(T val) {
        stack1.push(val);
        return true;
    }

    public T deQueue() {
        if (stack1.isEmpty() && stack2.isEmpty()) return null;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) return null;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public void display() {
        if (stack1.isEmpty() && stack2.isEmpty()) return;
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }

}