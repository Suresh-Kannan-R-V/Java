package com.DSA.Graph;

import java.util.*;

public class GraphList<T extends Comparable<T>> {
    List<T> Node;
    Map<T, List<T>> graph;
    int vertex;

    GraphList(int vertex) {
        this.Node = new ArrayList<>();
        this.graph = new HashMap<>();
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
                    Node.add(node);
                    graph.put(node, new ArrayList<>());
                } else {
                    System.out.println("Max node limit reached. Ignored: " + node);
                }
            }
        }
        while (Node.size() != vertex) {
            Node.add(null);
            graph.put(null, new ArrayList<>());
        }
        return true;
    }

    public boolean add(T u, T v) {
        return add(u, v, true);
    }

    public boolean add(T u, T v, boolean undirected) {
        if (!graph.containsKey(u) || !graph.containsKey(v)) return false;
        graph.get(u).add(v);
        if (undirected) {
            graph.get(v).add(u);
        }
        return true;
    }

    public void display() {
        for (T node : Node) {
            System.out.print(node + " -> ");
            System.out.print(graph.get(node) + "\n");
        }
    }

    public void BFS(T val) {
        int ind = 0;
        List<T> result = new ArrayList<>();
        Set<T> set = new LinkedHashSet<>();
        result.add(val);
        set.add(val);

        while (result.size() < vertex) {
            T data = result.get(ind);
            for (T node : graph.get(data)) {
                if (set.add(node)) {
                    result.add(node);
                }
            }
            ind++;
        }
        System.out.println(result);
    }

    public void DFS(T val) {
        int ind = 0;

        List<T> result = new ArrayList<>();
        result.add(val);

        while (result.size() < vertex) {
            T data = result.get(ind);
            int i = ind + 1;
            for (T g : graph.get(data)) {
//                if (result.contains(g)) {
//                    int a = result.indexOf(g);
//                    if (a >= ind + 1) {
//                        result.remove(a);
//                        result.add(i++, g);
//                    }
//                } else {
//                    result.add(i++, g);
//                }
                if (!result.contains(g) || result.indexOf(g) >= ind + 1) {
                    result.remove(g);
                    result.add(i++, g);
                }
            }
            ind++;
        }
        System.out.println(result);
    }

}
