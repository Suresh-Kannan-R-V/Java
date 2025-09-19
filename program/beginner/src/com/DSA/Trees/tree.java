package com.DSA.Trees;

import com.DSA.Trees.TreeNode;
import com.DSA.Trees.BinarySearchTree;
import com.DSA.Trees.AVLTree;

public class tree {
    public static void main(String[] args) {
//        TreeNode<Integer> tree = new TreeNode<>(10);
//        tree.LeftInsert(tree.root, 50);
//        tree.RightInsert(tree.root, 20);
//
//        // Level 3
//        tree.LeftInsert(tree.root.LC, 30);
//        tree.RightInsert(tree.root.LC, 70);
//        tree.LeftInsert(tree.root.RC, 15);
//        tree.RightInsert(tree.root.RC, 25);
//
//        // Level 4
//        tree.LeftInsert(tree.root.LC.LC, 5);
//        tree.RightInsert(tree.root.LC.LC, 35);
//        tree.LeftInsert(tree.root.LC.RC, 65);
//        tree.RightInsert(tree.root.LC.RC, 85);
//        tree.LeftInsert(tree.root.RC.LC, 13);
//        tree.RightInsert(tree.root.RC.LC, 17);
//        tree.LeftInsert(tree.root.RC.RC, 23);
//        tree.RightInsert(tree.root.RC.RC, 27);
//
////        tree.LeftInsert(tree.root, 20);
////        tree.LeftInsert(tree.root.LC, 30);
////        tree.RightInsert(tree.root, 30);
////        tree.RightInsert(tree.root.LC.LC, 40);
////        tree.LeftInsert(tree.root.LC.LC.RC, 50);
////        tree.RightInsert(tree.root.LC.LC.RC.LC, 60);
//
//        tree.preOrder();
//        tree.preOrderIteration(tree.root);
//        tree.postOrder();
//        tree.inOrder();
//
//        System.out.println(tree.height(tree.root));
//        System.out.println(tree.NodeCount(tree.root));
//        System.out.println(tree.search(tree.root,2));
//        System.out.println(tree.isBalanced(tree.root));

//        BinarySearchTree<Character> BST = new BinarySearchTree<>('C');
//
//        BST.add('A');
//        BST.add('F');
//        BST.add('B');
//        BST.add('E');
//        BST.add('G');
//        BST.add('D');
//
//        BST.display(1);
//        BST.display(2);
//        BST.display(3);
//
//        System.out.println(BST.search('A'));
//        System.out.println(BST.delete('E'));
//        BST.display(3);


        AVLTree<Integer> AVL = new AVLTree<>(1);

        AVL.add(20);
        AVL.add(40);
        AVL.add(10);
        AVL.add(25);
        AVL.add(50);
        AVL.add(5);
        AVL.add(35);

        AVL.display(3);

        AVL.delete(40);

        AVL.display(3);


    }
}
