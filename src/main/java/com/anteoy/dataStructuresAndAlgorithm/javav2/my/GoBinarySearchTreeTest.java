package com.anteoy.dataStructuresAndAlgorithm.javav2.my;

/**
 * Created by zhoudazhuang on 17-3-2.
 * GoBinarySearchTreeTest
 */
public class GoBinarySearchTreeTest {
    public static void main(String[] args) {
        GoBinarySearchTree<Integer> tree = new GoBinarySearchTree<Integer>();
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        tree.printTree();
        System.out.println(" ");
        tree.remove(2);
        tree.remove(4);
        tree.printTree();
    }
}
