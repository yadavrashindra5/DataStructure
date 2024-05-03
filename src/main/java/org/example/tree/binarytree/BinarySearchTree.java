package org.example.tree.binarytree;

import org.example.tree.Node;

public class BinarySearchTree implements BinarySearchTreeInterface{
    @Override
    public Node insert(int data,Node root) {

        if(root==null) {
            Node newNode = new Node(data);
            return newNode;
        }else if(data<root.data){
            root.left=insert(data,root.left);
        }
        else {
            root.right=insert(data,root.right);
        }
        return root;
    }

    @Override
    public boolean search(int data, Node root) {
        if(root==null){
            return false;
        }
        else if(root.data==data){
            return true;
        }
        else if(data<root.data){
            return search(data,root.left);
        }
        else if(data>root.data){
            return search(data,root.right);
        }
        return false;
    }

    @Override
    public Node delete(int data, Node root) {
        if(root==null){
            System.out.println("there is no such node");
            return root;
        }else if(root.data==data){
            //There are three cases
            //There is no node to the current node
            if(root.left==null&&root.right==null){
                return null;
            }

            //There is one node to the current node

            else if(root.left!=null&&root.right==null){
                return root.left;
            }
            else if(root.right!=null&&root.left==null){
                return root.right;
            }

            //There is two node to the current node
            else if(root.left!=null&&root.right!=null){
                int largestValue=inorderPredecessor(root.left);
                System.out.println(largestValue);
                root.data=largestValue;
                root.left=delete(largestValue,root.left);
            }

        }else if(data<root.data){
            root.left=delete(data,root.left);
        }else if(data>root.data){
            root.right=delete(data,root.right);
        }
        return root;
    }

    /**
     * largest value in left subtree
     *
     * @param root node
     * @return
     */
    @Override
    public int inorderPredecessor(Node root) {
        if(root.right==null){
            return root.data;
        }
        return inorderPredecessor(root.right);
    }


    /**
     * smallest value in right subtree
     * @param root
     * @return
     */
    @Override
    public int inorderSuccessor(Node root) {
        if(root.left==null){
            return root.data;
        }

        return inorderSuccessor(root.left);
    }

    @Override
    public int heightOfBST(Node root) {
        /*
        * empty node have 0 height
        *
        * */

        if(root==null){
            return 0;
        }

        int left=heightOfBST(root.left);
        int right=heightOfBST(root.right);

        return Math.max(left,right)+1;
    }

    @Override
    public int numberOfNodes(Node root) {
        if(root==null){
            return 0;
        }
        int left=numberOfNodes(root.left);
        int right=numberOfNodes(root.right);
        return left+right+1;
    }

    @Override
    public int numberOfInternalNode(Node root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        int left=numberOfInternalNode(root.left);
        int right=numberOfInternalNode(root.right);
        return left+right+1;
    }

    @Override
    public int numberOfExternalNode(Node root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return numberOfExternalNode(root.left)+numberOfExternalNode(root.right);
    }

    @Override
    public int findSmallestElement(Node root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return root.data;
        }
        return findSmallestElement(root.left);
    }

    @Override
    public int findLargestElement(Node root) {
        if(root==null){
            return 0;
        }
        if(root.right==null){
            return root.data;
        }
        return findLargestElement(root.right);
    }
}
