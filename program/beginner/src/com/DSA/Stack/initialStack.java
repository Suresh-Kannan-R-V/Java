package com.DSA.Stack;

import com.DSA.Stack.Stack;

public class initialStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println(stack.min());
        System.out.println(stack.max());
        stack.display();
    }
}
