package com.medestin.loop.detection;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LoopDetectorTestSuite {
    private LoopDetector detector = new LoopDetector();

    @Test
    public void testWholeListAsLoopEvenPositive(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);
        listOne.appendToTail(six);
        listOne.appendToTail(seven);
        listOne.appendToTail(eight);
        listOne.appendToTail(nine);
        listOne.appendToTail(ten);
        ten.setNext(one);

        assertEquals(one, detector.detectLoop(listOne));
    }

    @Test
    public void testWholeListAsLoopUnevenList(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);
        listOne.appendToTail(six);
        listOne.appendToTail(seven);
        listOne.appendToTail(eight);
        listOne.appendToTail(nine);
        nine.setNext(one);

        assertEquals(one, detector.detectLoop(listOne));
    }

    @Test
    public void testNoLoop(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);
        listOne.appendToTail(six);
        listOne.appendToTail(seven);
        listOne.appendToTail(eight);
        listOne.appendToTail(nine);
        listOne.appendToTail(ten);

        assertNull(detector.detectLoop(listOne));
    }

    @Test
    public void testEvenLoop(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);
        listOne.appendToTail(six);
        listOne.appendToTail(seven);
        listOne.appendToTail(eight);
        listOne.appendToTail(nine);
        listOne.appendToTail(ten);
        ten.setNext(three);

        assertEquals(three, detector.detectLoop(listOne));
    }

    @Test
    public void testLastNodeSelfReferenced(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);
        listOne.appendToTail(six);
        listOne.appendToTail(seven);
        listOne.appendToTail(eight);
        listOne.appendToTail(nine);
        listOne.appendToTail(ten);
        ten.setNext(ten);

        assertEquals(ten, detector.detectLoop(listOne));
    }
}