package com.DSA.LinkedList;

public class DoubleLinkedList<T extends Comparable<T>> {
    Node head;
    int size = 0;

    class Node {
        T val;
        Node next;
        Node prev;

        Node(T value) {
            this.val = value;
            this.next = null;
            this.prev = null;
        }
    }

    public int size() {
        return size;
    }

    public boolean addFirst(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
            return true;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
            return true;
        }
    }

    public boolean add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
            return true;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = newNode;
            newNode.prev = start;
            size++;
            return true;
        }
    }

    public boolean add(int ind, T value) {
        Node start = head;
        if (ind == 0) {
            addFirst(value);
            return true;
        } else if (ind > 0 && ind < size) {
            Node newNode = new Node(value);
            while (ind-- > 1) {
                start = start.next;
            }
            newNode.next = start.next;
            newNode.prev = start;
            start.next = newNode;
            newNode.next.prev = newNode;
            size++;
            return true;
        } else if (ind == size) {
            add(value);
        }
        return false;
    }

    public void display() {
        Node start = head;
        while (start.next != null) {
            System.out.print(start.val + " -> ");
            start = start.next;
        }
        System.out.print(start.val + " -> null");
        System.out.print("\nnull");
        while (start != null) {
            System.out.print(" <- " + start.val);
            start = start.prev;
        }
    }

    public void display(boolean isForward) {
        Node start = head;
        if (isForward) {
            while (start != null) {
                System.out.print(start.val + " -> ");
                start = start.next;
            }
            System.out.println("null");
        } else {
            while (start.next != null)
                start = start.next;
            System.out.print("null");
            while (start != null) {
                System.out.print(" <- " + start.val);
                start = start.prev;
            }
        }
    }

    public boolean deleteFirst() {
        if (head == null) return false;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }

    public boolean delete() {
        if (head == null) return false;
        if (head.next == null) {
            head = null;
            size--;
            return true;
        }
        Node start = head;
        while (start.next != null && start.next.next != null) {
            start = start.next;
            System.out.println(start.val);
        }
        System.out.println(start.val);
        start.next.prev = null;
        start.next = null;
        size--;
        return true;
    }

    public boolean delete(int ind) {
        Node start = head;
        if (ind == 0) {
            deleteFirst();
            size--;
            return true;
        } else if (ind > 0 && ind < size) {
            while (ind-- > 1) {
                start = start.next;
            }
            System.out.println(start.val);
            start.next.prev = start.prev;
            start.prev.next = start.next;
            start.next = null;
            start.prev = null;
            size--;
            return true;
        }
        return false;
    }

    public boolean insertSort(T value) {
        Node newNode = new Node(value);
        if (head == null || head.val.compareTo(value) >= 0) {
            return add(0, value);
        }
        Node start = head;
        int ind = 1;
        while (start.next != null && start.next.val.compareTo(value) < 0) {
            start = start.next;
            ind++;
        }

        return add(ind, value);

    }

    public T get(int ind) {
        Node start = head;
        if (ind < 0 || ind >= size) return (T) Integer.valueOf(-1);
        while (ind-- > 0) {
            start = start.next;
        }
        return start.val;
    }
    public boolean set(int ind, T value) {
        Node start = head;
        if (ind < 0 || ind >= size) return false;
        while (ind-- > 0) {
            start = start.next;
        }
        start.val = value;
        return true;
    }
}
