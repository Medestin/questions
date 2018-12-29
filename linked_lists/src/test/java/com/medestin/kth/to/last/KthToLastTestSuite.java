package com.medestin.kth.to.last;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthToLastTestSuite {
    private KthToLast kthToLast = new KthToLast();

    @Test
    public void testOneElementInput(){
        MyLinkedList myLinkedList = new MyLinkedList(new Node(1));

        MyLinkedList returnList = kthToLast.returnKthToLast(myLinkedList, 0);

        assertEquals(1, returnList.getHeadNode().getValue());
    }

    @Test
    public void testMultipleElementInput(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);

        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);
        myLinkedList.appendToTail(fourthNode);
        myLinkedList.appendToTail(fifthNode);

        MyLinkedList returnList = kthToLast.returnKthToLast(myLinkedList, 2);
        assertEquals(3, returnList.getHeadNode().getValue());
        assertEquals(4, returnList.getHeadNode().getNext().getValue());
    }

    @Test
    public void testGettingTheLastNode(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);

        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);
        myLinkedList.appendToTail(fourthNode);
        myLinkedList.appendToTail(fifthNode);

        MyLinkedList returnList = kthToLast.returnKthToLast(myLinkedList, 4);
        assertEquals(5, returnList.getHeadNode().getValue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeIndex(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);

        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);
        myLinkedList.appendToTail(fourthNode);
        myLinkedList.appendToTail(fifthNode);

        MyLinkedList returnList = kthToLast.returnKthToLast(myLinkedList, -4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexTooBig(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);

        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);
        myLinkedList.appendToTail(fourthNode);
        myLinkedList.appendToTail(fifthNode);

        MyLinkedList returnList = kthToLast.returnKthToLast(myLinkedList, 40);
    }
}