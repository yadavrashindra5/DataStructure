package org.example.tree;

public class Main {
    public static void main(String[] args) {
        Node<Integer>root=null;
        Node<Integer>node=new Node<Integer>(89);
        root=node;
        node.left=new Node(79);
        node.right=new Node(90);
        Traversal traversal=new Traversal();
        System.out.println("preorder traversal");
        traversal.preorder(root);
        System.out.println("inorder traversal");
        traversal.inorder(root);
        System.out.println("postorder traversal");
        traversal.postorder(root);
    }
}
