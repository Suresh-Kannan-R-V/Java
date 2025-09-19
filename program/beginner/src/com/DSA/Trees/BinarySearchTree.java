package com.DSA.Trees;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    class Node<T> {
        T val;
        Node<T> prev;
        Node<T> next;

        Node(T val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    BinarySearchTree(T val) {
        this.root = new Node(val);
    }

    public boolean add(T val) {
        root = addRecursive(root, val);
        return true;
    }

    public Node<T> addRecursive(Node<T> curr, T val) {
        if (curr == null) {
            return new Node<>(val);
        }
        if (val.compareTo(curr.val) < 0) {
            curr.prev = addRecursive(curr.prev, val);
        } else if (val.compareTo(curr.val) > 0) {
            curr.next = addRecursive(curr.next, val);
        }
        return curr;
    }

    public boolean addIteration(T val) {
        Node<T> newNode = new Node<>(val);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node<T> curr = root;
        while (true) {
            if (val.compareTo(curr.val) < 0) {
                if (curr.prev == null) {
                    curr.prev = newNode;
                    return true;
                }
                curr = curr.prev;
            } else {
                if (curr.next == null) {
                    curr.next = newNode;
                    return true;
                }
                curr = curr.next;
            }
        }
    }


    public void display(int type) {
        switch (type) {
            case 1:
                System.out.printf("%-10s: ", "PreOrder");
                preOrder(root);
                break;
            case 2:
                System.out.printf("%-10s: ", "PostOrder");
                postOrder(root);
                break;
            case 3:
                System.out.printf("%-10s: ", "InOrder");
                inOrder(root);
                break;
        }
        System.out.println();
    }

    public void preOrder(Node<T> curr) {
        if (curr == null) return;
        System.out.print(curr.val + " ");
        preOrder(curr.prev);
        preOrder(curr.next);
    }

    public void postOrder(Node<T> curr) {
        if (curr == null) return;
        postOrder(curr.prev);
        postOrder(curr.next);
        System.out.print(curr.val + " ");
    }

    public void inOrder(Node<T> curr) {
        if (curr == null) return;
        inOrder(curr.prev);
        System.out.print(curr.val + " ");
        inOrder(curr.next);
    }

    public boolean search(T val) {
        return search(root, val);
    }

    public boolean search(Node<T> curr, T val) {
        if (curr == null) return false;
        if (curr.val.equals(val)) return true;
        if (val.compareTo(curr.val) < 0) {
            return search(curr.prev, val);
        } else {
            return search(curr.next, val);
        }
    }


    public boolean delete(T val) {
        deleteSuccessor(root, val);
        return true;
    }

    Node<T> deleteSuccessor(Node<T> curr, T val) {
        if (curr == null) return null;
        if (val.compareTo(curr.val) < 0)
            deleteSuccessor(curr.prev, val);
        else if (val.compareTo(curr.val) > 0)
            deleteSuccessor(curr.next, val);
        else {
            if (curr.prev == null) return curr.next;
            if (curr.next == null) return curr.prev;

            Node<T> Successor = findmin(curr.next);
            curr.val = Successor.val;
            curr.next = deleteSuccessor(curr.next, Successor.val);
        }
        return curr;
    }

    Node<T> deletePredecessor(Node<T> curr, T val) {
        if (curr == null) return null;
        if (val.compareTo(curr.val) < 0)
            deletePredecessor(curr.prev, val);
        else if (val.compareTo(curr.val) > 0)
            deletePredecessor(curr.next, val);
        else {
            if (curr.prev == null) return curr.next;
            if (curr.next == null) return curr.prev;

            Node<T> Predecessor = findmax(curr.prev);
            curr.val = Predecessor.val;
            curr.prev = deletePredecessor(curr.prev, val);
        }
        return curr;
    }

    Node<T> findmin(Node<T> node) {
        while (node.prev != null) {
            node = node.prev;
        }
        return node;
    }

    Node<T> findmax(Node<T> node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
}