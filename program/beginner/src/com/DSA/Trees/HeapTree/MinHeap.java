package com.DSA.Trees.HeapTree;

public class MinHeap<T extends Comparable<T>> {
    T[] arr;
    int size;

    MinHeap(int size) {
        this.arr = (T[]) new Comparable[size];
        this.size = 0;
    }

    boolean swap(int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return true;
    }

    public boolean add(T val) {
        if (size >= arr.length) return false;
        int ind = size;
        arr[ind] = val;

        while (ind > 0) {
            int parent = (ind - 1) / 2;
            if (arr[ind].compareTo(arr[parent]) >= 0) break;
            swap(ind, parent);
            ind = parent;
        }
        size++;
        return true;
    }

    public void display() {
        System.out.print("Min Heap : [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i != size - 1) System.out.print(", ");
        }
        System.out.print("]\n");
    }


}
