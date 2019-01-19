package com.medestin.loop.detection;

import com.medestin.MyLinkedList;
import com.medestin.Node;

public class LoopDetector {

    public Node detectLoop(MyLinkedList list){
        Node slowIterator = list.getHeadNode();
        Node fastIterator = list.getHeadNode().getNext();
        int count = 1;

        while(slowIterator != fastIterator){
            ++count;
            slowIterator = slowIterator.getNext();
            try {
                fastIterator = fastIterator.getNext().getNext();
            } catch (NullPointerException e){
                return null;
            }
        }
        Node current = list.getHeadNode();
        for(int i = 0; i < count; ++i){
            for(int j = 0; j < count; ++j){
                if(current == fastIterator){
                    return current;
                } else {
                    fastIterator = fastIterator.getNext();
                }
            }
            current = current.getNext();
        }
        return null;
    }
}
