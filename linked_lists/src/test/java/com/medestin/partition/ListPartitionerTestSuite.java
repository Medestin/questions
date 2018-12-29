package com.medestin.partition;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ListPartitionerTestSuite {
    private ListPartitioner partitioner = new ListPartitioner();

    @Test
    public void testListPartitionerOnEvenList(){
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
        myLinkedList.appendToTail(sixthNode);
        myLinkedList.appendToTail(seventhNode);
        myLinkedList.appendToTail(eighthNode);
        myLinkedList.appendToTail(ninthNode);
        myLinkedList.appendToTail(tenthNode);
        myLinkedList.appendToTail(secondNode);
        myLinkedList.appendToTail(thirdNode);
        myLinkedList.appendToTail(fourthNode);
        myLinkedList.appendToTail(fifthNode);

        partitioner.partition(myLinkedList, 6);

        assertTrue(myLinkedList.getHeadNode().getValue() < 6);
    }

    @Test
    public void testPartitionerOnMoreScrambledList(){
        Node headNode = new Node(10);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(34);
        Node fourthNode = new Node(14);
        Node fifthNode = new Node(12);
        Node sixthNode = new Node(7);
        Node seventhNode = new Node(23);
        Node eighthNode = new Node(24);
        Node ninthNode = new Node(11);
        Node tenthNode = new Node(17);


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

        partitioner.partition(myLinkedList, 17);

        Node lastLeftSideNode = myLinkedList.getHeadNode().getNext().getNext().getNext().getNext().getNext();
        assertTrue(myLinkedList.getHeadNode().getValue() < 17);
        assertTrue(lastLeftSideNode.getValue() < 17);
    }

}