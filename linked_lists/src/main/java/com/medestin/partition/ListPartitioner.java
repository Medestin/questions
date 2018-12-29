package com.medestin.partition;

import com.medestin.MyLinkedList;
import com.medestin.Node;

public class ListPartitioner {

    public void partition(MyLinkedList list, int pivot){
        MyLinkedList leftSideList = new MyLinkedList(new Node(0));
        MyLinkedList rightSideList = new MyLinkedList(new Node(0));

        Node current = list.getHeadNode();
        while(current != null){
            Node placeholder = current.getNext();
            if(current.getValue() < pivot){
                current.setNext(null);
                leftSideList.appendToTail(current);
            } else {
                current.setNext(null);
                rightSideList.appendToTail(current);
            }
            current = placeholder;
        }
        leftSideList.setHeadNode(leftSideList.getHeadNode().getNext());
        rightSideList.setHeadNode(rightSideList.getHeadNode().getNext());

        leftSideList.appendToTail(rightSideList.getHeadNode());

        list.setHeadNode(leftSideList.getHeadNode());
    }
}
