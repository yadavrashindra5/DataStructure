package org.example.tree.binarytree;

import org.example.tree.Node;


public interface BinarySearchTreeInterface {
    Node insert(int data,Node root);
    boolean search(int data,Node root);
    Node delete(int data,Node root);
    int inorderPredecessor(Node root);
    int inorderSuccessor(Node root);
    int heightOfBST(Node root);
    int numberOfNodes(Node root);
    int numberOfInternalNode(Node root);
    int numberOfExternalNode(Node root);
    int findSmallestElement(Node root);
    int findLargestElement(Node root);
}
