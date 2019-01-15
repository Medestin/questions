package com.medestin.sum.lists;

import com.medestin.MyLinkedList;
import com.medestin.Node;

public class SumLists {

    public MyLinkedList sumLists(MyLinkedList listOne, MyLinkedList listTwo) {
        Node one = listOne.getHeadNode();
        Node two = listTwo.getHeadNode();

        Node returnHead = sumNodes(one, two, 0);

        return new MyLinkedList(returnHead);
    }

    private Node sumNodes(Node headOne, Node headTwo, int surplus) {
        if (headOne == null && headTwo == null) {
            if (surplus == 0) {
                return null;
            } else {
                return new Node(surplus);
            }
        } else {
            if (headOne == null) {
                int value = headTwo.getValue() + surplus;
                Node node = new Node(value % 10);
                node.setNext(sumNodes(null, headTwo.getNext(), value / 10));
                return node;
            } else if (headTwo == null) {
                int value = headOne.getValue() + surplus;
                Node node = new Node(value % 10);
                node.setNext(sumNodes(headOne.getNext(), null, value / 10));
                return node;
            } else {
                int value = headOne.getValue() + headTwo.getValue() + surplus;
                Node node = new Node(value % 10);
                node.setNext(sumNodes(headOne.getNext(), headTwo.getNext(), value / 10));
                return node;
            }
        }
    }
}
