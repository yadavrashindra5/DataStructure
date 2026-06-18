package org.example.tree;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Node  {
    public Node left;
    public Node right;
    public int data;

    public Node(int data){
        this.data=data;
    }


}
