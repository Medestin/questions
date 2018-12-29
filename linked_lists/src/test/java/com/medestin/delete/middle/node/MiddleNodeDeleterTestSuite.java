package com.medestin.delete.middle.node;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleNodeDeleterTestSuite {
    private MiddleNodeDeleter nodeDeleter = new MiddleNodeDeleter();

    @Test
    public void testDeletingCenterNode(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);

        nodeDeleter.deleteNode(secondNode);

        assertEquals(3, myLinkedList.getHeadNode().getNext().getValue());
        assertNull(myLinkedList.getHeadNode().getNext().getNext());
    }

    @Test
    public void testDeletingTwoNodesFromBiggerList(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);
        Node seventhNode = new Node(7);
        Node eighthNode = new Node(8);
        Node ninthNode = new Node(9);
        Node tenthNode = new Node(10);


        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);
        myLinkedList.appendToTail(fourthNode);
        myLinkedList.appendToTail(fifthNode);
        myLinkedList.appendToTail(sixthNode);
        myLinkedList.appendToTail(seventhNode);
        myLinkedList.appendToTail(eighthNode);
        myLinkedList.appendToTail(ninthNode);
        myLinkedList.appendToTail(tenthNode);

        nodeDeleter.deleteNode(eighthNode);
        nodeDeleter.deleteNode(fourthNode);

        Node nodeOnFourthIndex = myLinkedList.getHeadNode().getNext().getNext().getNext();
        Node nodeOnSeventhIndex = myLinkedList.getHeadNode().getNext().getNext().getNext().getNext().getNext().getNext();

        assertEquals(5, nodeOnFourthIndex.getValue());
        assertEquals(9, nodeOnSeventhIndex.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteWrongNode(){
        Node headNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        MyLinkedList myLinkedList = new MyLinkedList(headNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);

        nodeDeleter.deleteNode(thirdNode);
    }
}