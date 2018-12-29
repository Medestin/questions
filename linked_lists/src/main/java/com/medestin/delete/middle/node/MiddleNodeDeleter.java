package com.medestin.delete.middle.node;

import com.medestin.Node;

public class MiddleNodeDeleter {

    public void deleteNode(Node node){
        if(node.getNext() == null){
            throw new IllegalArgumentException("not a middle node");
        }
        node.setValue(node.getNext().getValue());
        node.setNext(node.getNext().getNext());
    }
}
