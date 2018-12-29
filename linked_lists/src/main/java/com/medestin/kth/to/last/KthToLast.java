package com.medestin.kth.to.last;

import com.medestin.MyLinkedList;
import com.medestin.Node;

public class KthToLast {

    public MyLinkedList returnKthToLast(MyLinkedList list, int index){

        if(index < 0){
            throw new IndexOutOfBoundsException("index value negative");
        }

        Node current = list.getHeadNode();
        for(int i = 0; i != index; ++i){
            if(current.getNext() != null){
                current = current.getNext();
            } else {
                throw new IndexOutOfBoundsException("index value bigger than the list");
            }
        }
        return new MyLinkedList(current);
    }
}
