package com.DSA.LinkedList;

public class LinkedList<T extends Comparable<T>> {
    Node head;
    long size = 0;

    class Node {
        T value;
        Node next;

        Node(T val) {
            this.value = val;
            this.next = null;
        }
    }

    //Finding Size Function
    public int size() {
        return (int) size;
    }

    public void display() {
        Node secHead = head;
        while (secHead != null) {
            System.out.print(secHead.value + " -> ");
            secHead = secHead.next;
        }
        System.out.println("null");
    }

    //add function at the end
    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) head = newNode;
        else {
            Node secHead = head;
            while (secHead.next != null) {
                secHead = secHead.next;
            }
            secHead.next = newNode;
        }
        size++;
    }

    public void add(int ind, T value) throws IndexOutOfBoundsException {
        if (ind == 0) {
            addFirst(value);
            return;
        } else if (ind > 0 && ind < size) {
            Node newNode = new Node(value);
            Node secHead = head;
            for (int i = 0; i < ind - 1; i++) {
                secHead = secHead.next;
            }
            newNode.next = secHead.next;
            secHead.next = newNode;
            size++;
        } else if (ind == size) {
            add(value);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
    }

    //add function at the beginning
    public void addFirst(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //get function with index
    public T get(int ind) throws IndexOutOfBoundsException {
        if (ind < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative.");
        }
        Node secHead = head;
        while (secHead != null) {
            if (ind == 0) {
                return secHead.value;
            }
            secHead = secHead.next;
            ind--;
        }
        throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    public void delete(int ind) {
        if (ind == 0) {
            deleteFirst();
            size--;
            return;
        } else if (ind > 0 && ind < size) {
            Node secHead = head;
            for (int i = 0; i < ind - 1; i++) {
                secHead = secHead.next;
            }
            secHead.next = secHead.next.next;
            size--;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
    }

    public void deleteLast() {
        if (head == null) return;
        Node secHead = head;
        while (secHead.next.next != null) {
            secHead = secHead.next;
        }
        secHead.next = null;
        size--;
    }

    public void set(T oldVal, T newVal) {
        Node secHead = head;
        boolean found = false;
        while (secHead != null) {
            if (secHead.value.equals(oldVal)) {
                secHead.value = newVal;
                return;
            }
            secHead = secHead.next;
        }
    }

    public void setAt(int ind, T newVal) throws IndexOutOfBoundsException {
        if (ind < 0 && ind > size) throw new IndexOutOfBoundsException("Index out of bounds.");
        Node secHead = head;
        while (secHead != null) {
            if (ind == 0) {
                secHead.value = newVal;
            }
            ind--;
            secHead = secHead.next;
        }
    }

    public void sort() {
        if (head == null || head.next == null) return;
        boolean isSwapped;
        do {
            Node current = head;
            isSwapped = false;
            while (current != null && current.next != null) {
                if (current.value.compareTo(current.next.value) > 0) {
                    T temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;
                    isSwapped = true;
                }
                current = current.next;
            }
        } while (isSwapped);
    }

    public T min() {
        Node secHead = head;
        T min = secHead.value;
        while (secHead != null) {
            if (secHead.value.compareTo(min) < 0) {
                min = secHead.value;
            }
            secHead = secHead.next;
        }
        return min;
    }

    public T max() {
        Node secHead = head;
        T max = secHead.value;
        while ((secHead != null)) {

            if (secHead.value.compareTo(max) > 0) {
                max = secHead.value;
            }
            secHead = secHead.next;
        }
        return max;
    }

    public int search(T value) {
        int ind = 0;
        Node secHead = head;
        while (secHead != null) {
            if (secHead.value.compareTo(value) == 0) return ind;
            ind++;
            secHead = secHead.next;
        }
        return -1;
    }

    public T sum() {
        Node secHead = head;
        if (secHead.value instanceof String || secHead.value instanceof Character) {
            StringBuilder result = new StringBuilder();
            while (secHead != null) {
                result.append(secHead.value);
                secHead = secHead.next;
            }
            return (T) result.toString();
        } else if (secHead.value instanceof Number) {
            double sum = 0.0;
            while (secHead != null) {
                sum += ((Number) secHead.value).doubleValue();
                secHead = secHead.next;
            }
            return (T) Double.valueOf(sum);
        }
        return null;
    }

    enum Order {
        ASC, DESC
    }

    public boolean isSort(Order order) {
        Node secHead = head;
        while (secHead != null && secHead.next != null) {
            int compare = secHead.value.compareTo(secHead.next.value);
            if (order == Order.ASC && compare > 0) {
                return false;
            } else if (order == order.DESC && compare < 0) {
                return false;

            }
            secHead = secHead.next;
        }
        return true;
    }

    public int optmizeSearch(T val) {
        Node secHead = head;
        int ind = 1;
        if (secHead != null && secHead.value.equals(val)) return 0;
        while (secHead != null && secHead.next != null) {
            if (secHead.next.value.equals(val)) {
                Node newNode = new Node(val);
                newNode.next = head;
                head = newNode;
                secHead.next = secHead.next.next;
                return ind;
            }
            secHead = secHead.next;
            ind++;
        }
        return -1;
    }

    public void removeDuplicates() {
        sort();
        Node secHead = head;
        while (secHead != null && secHead.next != null) {
            if (secHead.value.equals(secHead.next.value)) {
                secHead.next = secHead.next.next;
                size--;
            } else secHead = secHead.next;
        }
    }


    public void createCycle(int ind) {
        Node secHead = head;
        Node cycleNode = head;
        while (ind-- > 0) {
            secHead = secHead.next;
        }
        cycleNode = secHead;
        while (secHead.next != null) {
            secHead = secHead.next;
        }
        secHead.next = cycleNode;
    }

    public boolean isCycle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public void createCycle(int from, int to) {
        if (from <= to || from < 0 || to < 0 || from > size || to > size) return;

        Node secHead = head;
        Node toNode = head;
        for (int i = 0; i < from; i++) {
            if (i == to) {
                toNode = secHead;
            }
            secHead = secHead.next;
        }
        if (secHead != null)
            secHead.next = toNode;
    }

    public void removeCycle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        fast.next = null;

    }

}