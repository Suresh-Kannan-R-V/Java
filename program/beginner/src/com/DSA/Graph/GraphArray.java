package com.DSA.Graph;

import java.util.ArrayList;
import java.util.*;

public class GraphArray<T extends Comparable<T>> {
    List<T> Node;
    int[][] graph;
    int vertex;

    GraphArray(int vertex) {
        this.Node = new ArrayList<>(vertex);
        this.graph = new int[vertex][vertex];
        this.vertex = vertex;
    }

    public boolean addNodes(List<T> nodes) {
        if (nodes.size() > vertex) return false;
        for (T node : nodes) {
            if (Node.contains(node)) {
                System.out.println("Duplicate node ignored: " + node);
                return false;
            } else {
                if (Node.size() < vertex) {
                    this.Node.add(node);
                } else {
                    System.out.println("Max node limit reached. Ignored: " + node);
                }
            }
        }

        while (Node.size() != vertex) Node.add(null);

        return true;
    }

    private int getIndex(T value) {
        return Node.indexOf(value);
    }

    public boolean add(T u, T v) {
        return add(u, v, true);
    }

    public boolean add(T u, T v, boolean undirected) {
        int ind1 = getIndex(u);
        int ind2 = getIndex(v);
        if (ind1 == -1 && ind2 == -1) return false;
        graph[ind1][ind2] = 1;
        if (undirected) {
            graph[ind2][ind1] = 1;
        }
        return true;
    }

    public void display() {
        System.out.println(" " + Node);
        for (int i = 0; i < Node.size(); i++) {
            System.out.print(Node.get(i) == null ? "_| " : Node.get(i) + "| ");
            for (int j : graph[i]) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

}
