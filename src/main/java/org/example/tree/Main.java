package org.example.tree;

import org.example.tree.binarytree.BinarySearchTree;
import org.example.tree.binarytree.BinarySearchTreeInterface;

public class Main {
    public static void main(String[] args) {
        Node root=null;
        Traversal traversal=new Traversal();
        BinarySearchTreeInterface bst=new BinarySearchTree();
        int arr[]={45,39,56,12,34,78,32,10,89,54,67,81};
        for(int i=0;i<arr.length;++i){
            root=bst.insert(arr[i],root);
        }
//        traversal.preorder(root);
//        System.out.println();
//        traversal.postorder(root);
//        System.out.println();
//        traversal.inorder(root);
//        System.out.println();
//        System.out.println(bst.heightOfBST(root));
        bst.mirrorImage(root);
        traversal.preorder(root);
    }
}
