package org.example.tree;

public class Traversal {
    public <T> void preorder(Node<T> root){
        //Node-Left-Right
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public <T> void inorder(Node<T> root){
        //Left-Node-Right
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public <T> void postorder(Node<T> root){
        //Left-Right-Node
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public <T> void levelorder(Node<T> root){

    }
}
