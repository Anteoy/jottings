package com.anteoy.dataStructuresAndAlgorithm.dataStructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhoudazhuang
 * @date 19-4-29 17:29
 * @description
 */
class Node {
    int data;
    Node parent;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class SearchTree{
    Node root;
    long size;

    public boolean addTreeNode(Node addNode){
        // root空或非空
        if (root == null) {
            root = addNode;
            System.out.println("数据插入root节点");
            return true;
        }
        return addNodex(root,addNode);
    }

    boolean findNode(Node parent,int value){
        if (parent.data == value) {
            return true;
        }else if (value < parent.data && parent.left != null) {
            return findNode(parent.left,value);
        }else if (value > parent.data && parent.right != null){
            return findNode(parent.right, value);
        }
        return false;
    }

    public boolean addNodex(Node parent, Node addNode){
        Node currentNode = parent;
        Node tmp = parent;
        if (currentNode.data == addNode.data) {
            System.out.println("不能插入已存在的值,跳过处理");
            return true;
        }else if (addNode.data < currentNode.data) {
            currentNode = currentNode.left;
            if (currentNode == null) {
                tmp.left = addNode;
                addNode.parent = tmp;
                return true;
            }
            addNodex(currentNode,addNode);
        }else if (addNode.data > currentNode.data) {
            currentNode = currentNode.right;
            if (currentNode == null){
                tmp.right = addNode;
                addNode.parent = tmp;
                return true;
            }
            addNodex(currentNode,addNode);
        }
        return true;
    }

    static void medSerial(Node root){
        List<Node> result = new ArrayList<>();
        medOrderSerial(root,result);
        for (Node node: result) {
          System.out.print(node.data + " ");
        }
    }

    static void medOrderSerial(Node parent, List<Node> result){
        if (parent.left != null) {
            medOrderSerial(parent.left, result);
        }
        result.add(parent);
        if (parent.right != null) {
            medOrderSerial(parent.right,result);
        }
    }


  public static void main(String[] args) {
      SearchTree searchTree = new SearchTree();
      searchTree.addTreeNode(new Node(7));
      searchTree.addTreeNode(new Node(4));
      searchTree.addTreeNode(new Node(13));
      searchTree.addTreeNode(new Node(1));
      searchTree.addTreeNode(new Node(5));
      searchTree.addTreeNode(new Node(10));
      searchTree.addTreeNode(new Node(15));
      searchTree.addTreeNode(new Node(2));
      searchTree.addTreeNode(new Node(12));
      searchTree.addTreeNode(new Node(14));
      searchTree.addTreeNode(new Node(18));
      medSerial(searchTree.root);
      searchTree.addTreeNode(new Node(3));
      System.out.println(" ");
      medSerial(searchTree.root);
      System.out.println("");
      System.out.println(searchTree.findNode(searchTree.root,14));
  }
}
