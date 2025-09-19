package com.DSA.Stack.Evaluation;

import java.util.*;

public class infixToPostFix {
    String result = "";

    infixToPostFix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        int num = 0;
        boolean number = false;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                number = true;
            } else if (c != ' ') {
                if (number) {
                    str.append(num).append(" ");
                    num = 0;
                    number = false;
                }
                if (c == '(') stack.push(c);
                else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        str.append(stack.pop()).append(" ");
                        ;
                    }
                    if (!stack.isEmpty()) stack.pop();
                } else {
                    while (!stack.isEmpty() && preiority(stack.peek()) >= preiority(c)) {
                        str.append(stack.pop()).append(" ");
                        ;
                    }
                    stack.push(c);
                }
            }
            System.out.println(str.toString());
        }
        while (!stack.isEmpty()) {
            str.append(stack.pop()).append(" ");
        }
        System.out.println(str.toString());
        this.result = str.toString();
    }

    public static int preiority(char s) {
        switch (s) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

}
