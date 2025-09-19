package com.DSA.Trees;

import java.util.*;

class NArrayTree {
    Node root;

    class Node {
        int data;
        Node[] children;

        Node(int data) {
            this.data = data;
            children = new Node[data]; // Using data as max children count
        }
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (int i = 0; i < current.children.length; i++) {
                if (current.children[i] == null) {
                    current.children[i] = new Node(data);
                    return;
                } else {
                    queue.add(current.children[i]);
                }
            }
        }
    }

    public void LevelOrder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            for (Node child : current.children) {
                if (child != null) {
                    queue.add(child);
                }
            }
        }
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            for (Node child : current.children) {
                if (child != null) {
                    queue.add(child);
                }
            }
        }
    }

    public int height() {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                for (Node child : current.children) {
                    if (child != null) {
                        queue.add(child);
                    }
                }
            }
            height++;
        }
        return height;
    }
}
