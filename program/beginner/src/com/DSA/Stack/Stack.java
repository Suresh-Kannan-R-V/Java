package com.DSA.Stack;

public class Stack<T extends Comparable<T>> {
    T[] stack;
    int size = 0, count = 0;
    int top = -1;

    Stack(int size) {
        this.stack = (T[]) new Comparable[size];
        this.size = size;
    }

    public boolean push(T value) {
        if (top < size) {
            stack[++top] = value;
            count++;
            return true;
        }
        throw new ArrayIndexOutOfBoundsException("out of bound");
    }

    public T peek() {
        if (top >= 0) {
            return stack[top];
        }
        throw new ArrayIndexOutOfBoundsException("Stack is empty");
    }

    public T pop() {
        if (top >= 0) {
            T temp = stack[top--];
            count--;
            return temp;
        }
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("|  %-1s  |\n", stack[i]);
            System.out.println("├─────┤");
        }
        System.out.println("↑ Top");
    }

    public T max() {
        T max = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i].compareTo(max) > 0) {
                max = stack[i];
            }
        }
        return max;
    }

    public T min() {
        T min = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i].compareTo(min) > 0) {
                min = stack[i];
            }
        }
        return min;
    }
}
