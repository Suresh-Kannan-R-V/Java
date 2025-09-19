package com.DSA.Trees.HeapTree;

import com.DSA.Trees.HeapTree.MaxHeap;
import com.DSA.Trees.HeapTree.MinHeap;

public class Heap {
    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<>(10);
        MinHeap<Integer> minHeap = new MinHeap<>(10);
        maxHeap.add(50);
        maxHeap.add(0);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(60);
        maxHeap.add(75);
        maxHeap.add(30);


        minHeap.add(50);
        minHeap.add(0);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(60);
        minHeap.add(75);
        minHeap.add(30);

        maxHeap.display();
        minHeap.display();
    }
}
