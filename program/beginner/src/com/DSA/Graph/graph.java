package com.DSA.Graph;

import com.DSA.Graph.GraphArray;
import com.DSA.Graph.GraphList;

import java.util.Arrays;

public class graph {
    public static void main(String[] args) {
//        GraphArray<String> g = new GraphArray<>(7);

//        g.addNodes(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));

        //Directed Graph
//        g.add("A", "B", false);
//        g.add("A", "C", false);
//        g.add("B", "D", false);
//        g.add("C", "D", false);
//        g.add("D", "E", false);
//        g.add("E", "B", false);
//        g.add("F", "G", false);

        //UnDirected Graph
//        g.add("A", "B");
//        g.add("A", "C");
//        g.add("B", "D");
//        g.add("C", "D");
//        g.add("D", "E");
//        g.add("F", "G");
//        g.display();
//        GraphList<String> g = new GraphList<>(8);
//        g.addNodes(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H"));

        //Undirected Graph
//        g.add("A", "B");
//        g.add("A", "C");
//        g.add("B", "D");
//        g.add("C", "E");
//        g.display();

        //Directed Graph
//        g.add("A", "B");
//        g.add("A", "C");
//        g.add("B", "D");
//        g.add("C", "E");
//        g.add("D", "F");
//        g.add("E", "F");
//        g.add("F", "G");
//        g.add("G", "H");
//        g.display();
//        g.BFS("A");

        GraphList<Integer> g = new GraphList<>(10);
        g.addNodes(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        g.add(0, 1);
        g.add(0, 2);
        g.add(0, 4);
        g.add(0, 8);

        g.add(1, 5);
        g.add(1, 6);
        g.add(1, 9);
        g.add(2, 4);
        g.add(3, 7);
        g.add(3, 8);

        g.add(5, 8);

        g.add(6, 7);
        g.add(6, 9);

        g.display();
        g.BFS(0);
        g.DFS(0);
    }
}
