package org.example.tree;

public class Traversal {
    public  void preorder(Node root){
        //Node-Left-Right
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        //Left-Node-Right
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void postorder(Node root){
        //Left-Right-Node
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelorder(Node root){

    }
}
