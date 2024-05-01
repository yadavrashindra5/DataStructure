package org.example.tree;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Node <T> {
    public Node left;
    public Node right;
    public T data;

    public Node(T data){
        this.data=data;
    }


}
