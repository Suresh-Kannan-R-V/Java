package com.DSA.Trees;

import java.util.*;

public class TreeNode<T extends Comparable<T>> {
    Node root;

    class Node {
        T val;
        Node LC;
        Node RC;

        Node(T val) {
            this.val = val;
            this.LC = this.RC = null;
        }
    }

    TreeNode(T val) {
        this.root = new Node(val);
    }

    public boolean LeftInsert(Node toLeft, T val) {
        if (root == null) return false;
        toLeft.LC = new Node(val);
        return true;

    }

    public boolean RightInsert(Node toRight, T val) {
        if (root == null) return false;
        toRight.RC = new Node(val);
        return true;

    }

    public void display() {
        System.out.print("PreOrder : ");
        preOrder();
        System.out.print("PostOrder : ");
        postOrder();
        System.out.print("InOrder : ");
        inOrder();
    }

    public void display(int n) {
        switch (n) {
            case 1:
                preOrder();
                break;
            case 2:
                postOrder();
                break;
            case 3:
                inOrder();
                break;
        }
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    public void preOrder(Node start) {
        if (start == null) return;
        System.out.print(start.val + " ");
        preOrder(start.LC);
        preOrder(start.RC);

    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node start) {
        if (start == null) return;
        postOrder(start.LC);
        postOrder(start.RC);
        System.out.print(start.val + " ");

    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node start) {
        if (start == null) return;
        inOrder(start.LC);
        System.out.print(start.val + " ");
        inOrder(start.RC);
    }

    Queue<Node> queue = new LinkedList<>();

    public boolean levelOrder(T val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            queue.offer(root);
            return true;
        }

        while (!queue.isEmpty()) {
            Node start = queue.peek();
            if (start.LC == null) {
                start.LC = newNode;
                queue.add(newNode);
                return true;
            } else if (start.RC == null) {
                start.RC = newNode;
                queue.add(newNode);
                queue.poll();
                return true;
            }

        }
        return false;
    }

    public int height(Node start) {
        if (start == null) return 0;
        return Math.max(height(start.LC), height(start.RC)) + 1;
    }

    public int NodeCount(Node start) {
        if (start == null) return 0;
        return NodeCount(start.LC) + NodeCount(start.RC) + 1;
    }

    public boolean search(Node start, T val) {
        if (start == null) return false;
        if (start.val.compareTo(val) == 0) return true;
        return search(start.LC, val) || search(start.RC, val);
    }

    public boolean isBalanced(Node start) {
        if (start == null)
            return true;
        int lheight = height(start.LC);
        int rheight = height(start.RC);
        if (Math.abs(lheight - rheight) > 1)
            return false;
        return isBalanced(start.LC) && isBalanced(start.RC);
    }

    public void preOrderIteration(Node start) {
        if (start == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.val + " ");
            if (temp.RC != null)
                stack.push(temp.RC);
            if (temp.LC != null)
                stack.push(temp.LC);
        }
        System.out.println();
    }
}
