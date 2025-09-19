package com.DSA.Trees;

public class AVLTree<T extends Comparable<T>> {
    Node<T> root;

    class Node<T> {
        T val;
        Node<T> left, right;
        int height;

        Node(T val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    AVLTree(T val) {
        this.root = new Node(val);
    }

    public boolean add(T val) {
        root = addRecursive(root, val);
        return true;
    }

    public boolean delete(T val) {
        deleteSuccerror(root, val);
        return true;
    }

    public Node<T> deleteSuccerror(Node<T> curr, T val) {
        if (curr == null) return null;
        if (val.compareTo(curr.val) < 0)
            curr.left = deleteSuccerror(curr.left, val);
        else if (val.compareTo(curr.val) > 0)
            curr.right = deleteSuccerror(curr.right, val);
        else {
            if (curr.left == null) return curr.right;
            if (curr.right == null) return curr.left;

            Node<T> Successor = findmin(curr.right);
            curr.val = Successor.val;
            curr.right = deleteSuccerror(curr.right, Successor.val);
        }

        curr.height = Math.max(height(curr.left), height(curr)) + 1;
        int balance = height(curr.left) - height(curr.right);

        if (balance < -1) {
            //RR
            if (getBalance(curr.right) <= 0) {
                return leftRotate(curr);
            }
            //RL
            if (getBalance(curr.right) > 0) {
                curr.right = rightRotate(curr.right);
                return leftRotate(curr);
            }
        } else if (balance > 1) {

            //LL
            if (getBalance(curr.left) >= 0) {
                return rightRotate(curr);
            }
            //LR
            if (getBalance(curr.left) < 0) {
                curr.left = leftRotate(curr.left);
                return rightRotate(curr);
            }
        }
        return curr;
    }

    int getBalance(Node<T> node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    Node<T> findmin(Node<T> node) {
        while (node != null) node = node.left;
        return node;
    }

    public Node<T> addRecursive(Node<T> curr, T val) {
        if (curr == null) return new Node(val);
        if (val.compareTo(curr.val) < 0) curr.left = addRecursive(curr.left, val);
        else if (val.compareTo(curr.val) > 0) curr.right = addRecursive(curr.right, val);
        else return curr;

        curr.height = Math.max(height(curr.left), height(curr.right)) + 1;
        int balance = height(curr.left) - height(curr.right);

        if (balance < -1) {
            //RR
            if (val.compareTo(curr.right.val) > 0) {
                return leftRotate(curr);
            }
            //RL
            if (val.compareTo(curr.right.val) < 0) {
                curr.right = rightRotate(curr.right);
                return leftRotate(curr);
            }

        } else if (balance > 1) {
            //LL
            if (val.compareTo(curr.left.val) < 0) {
                return rightRotate(curr);
            }
            //LR
            if (val.compareTo(curr.left.val) > 0) {
                curr.left = leftRotate(curr.left);
                return rightRotate(curr);
            }
        }
        return curr;
    }

    public Node<T> leftRotate(Node<T> parent) {
        Node<T> center = parent.right;
        Node<T> centerleft = center.left;

        center.left = parent;
        parent.right = centerleft;

        parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
        center.height = Math.max(height(center.left), height(center.right)) + 1;
        return center;
    }

    public Node<T> rightRotate(Node<T> parent) {
        Node<T> center = parent.left;
        Node<T> centerright = center.right;

        center.right = parent;
        parent.left = centerright;

        parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
        center.height = Math.max(height(center.left), height(center.right)) + 1;

        return center;
    }

    public int height(Node<T> curr) {
        if (curr == null) return 0;
        return curr.height;
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
        preOrder(curr.left);
        preOrder(curr.right);
    }

    public void postOrder(Node<T> curr) {
        if (curr == null) return;
        postOrder(curr.left);
        postOrder(curr.right);
        System.out.print(curr.val + " ");
    }

    public void inOrder(Node<T> curr) {
        if (curr == null) return;
        inOrder(curr.left);
        System.out.print(curr.val + " ");
        inOrder(curr.right);
    }
}
