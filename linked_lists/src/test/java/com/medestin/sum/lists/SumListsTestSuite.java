package com.medestin.sum.lists;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumListsTestSuite {
    private SumLists sumLists = new SumLists();

    @Test
    public void testEvenLists(){
        Node one = new Node(8);
        Node two = new Node(7);
        Node three = new Node(9);

        Node node1 = new Node(5);
        Node node2 = new Node(8);
        Node node3 = new Node(6);

        //number 978
        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);

        //number 685
        MyLinkedList listTwo = new MyLinkedList(node1);
        listTwo.appendToTail(node2);
        listTwo.appendToTail(node3);

        //result 1663(list 3661)
        MyLinkedList sumList = sumLists.sumLists(listOne, listTwo);

        MyLinkedList assertList = new MyLinkedList(new Node(3));
        assertList.appendToTail(new Node(6));
        assertList.appendToTail(new Node(6));
        assertList.appendToTail(new Node(1));

        Node currentSum = sumList.getHeadNode();
        Node currentAssert = assertList.getHeadNode();

        while(currentAssert != null){

            assertEquals(currentSum.getValue(), currentAssert.getValue());

            currentSum = currentSum.getNext();
            currentAssert = currentAssert.getNext();
        }
    }

    @Test
    public void testUnevenLists(){
        Node one = new Node(5);
        Node two = new Node(1);
        Node three = new Node(4);
        Node four = new Node(3);

        Node node1 = new Node(6);
        Node node2 = new Node(2);
        Node node3 = new Node(7);

        //number 3415
        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);

        //number 726
        MyLinkedList listTwo = new MyLinkedList(node1);
        listTwo.appendToTail(node2);
        listTwo.appendToTail(node3);

        //result 4141(list 1414)
        MyLinkedList sumList = sumLists.sumLists(listOne, listTwo);

        MyLinkedList assertList = new MyLinkedList(new Node(1));
        assertList.appendToTail(new Node(4));
        assertList.appendToTail(new Node(1));
        assertList.appendToTail(new Node(4));


        Node currentSum = sumList.getHeadNode();
        Node currentAssert = assertList.getHeadNode();

        while(currentAssert != null){

            assertEquals(currentSum.getValue(), currentAssert.getValue());

            currentSum = currentSum.getNext();
            currentAssert = currentAssert.getNext();
        }
    }

    @Test
    public void testHugeNumbers(){
        Node one = new Node(9);
        Node two = new Node(9);
        Node three = new Node(9);
        Node four = new Node(9);
        Node five = new Node(9);

        Node node1 = new Node(9);
        Node node2 = new Node(9);
        Node node3 = new Node(9);
        Node node4 = new Node(9);
        Node node5 = new Node(9);

        //number 99999
        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);

        //number 99999
        MyLinkedList listTwo = new MyLinkedList(node1);
        listTwo.appendToTail(node2);
        listTwo.appendToTail(node3);
        listTwo.appendToTail(node4);
        listTwo.appendToTail(node5);

        //result 199998(list 899991)
        MyLinkedList sumList = sumLists.sumLists(listOne, listTwo);

        MyLinkedList assertList = new MyLinkedList(new Node(8));
        assertList.appendToTail(new Node(9));
        assertList.appendToTail(new Node(9));
        assertList.appendToTail(new Node(9));
        assertList.appendToTail(new Node(9));
        assertList.appendToTail(new Node(1));


        Node currentSum = sumList.getHeadNode();
        Node currentAssert = assertList.getHeadNode();

        while(currentAssert != null){

            assertEquals(currentSum.getValue(), currentAssert.getValue());

            currentSum = currentSum.getNext();
            currentAssert = currentAssert.getNext();
        }
    }
}