package com.medestin.intersection;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class IntersectionTestSuite {
    private Intersection intersection = new Intersection();

    @Test
    public void testIntersectionEvenLists(){
        Node one = new Node(5);
        Node two = new Node(1);
        Node three = new Node(4);

        Node node1 = new Node(6);
        Node node2 = new Node(2);
        Node node3 = new Node(7);

        Node intersectionNode = new Node(8);
        intersectionNode.setNext(new Node(15));

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(intersectionNode);

        MyLinkedList listTwo = new MyLinkedList(node1);
        listTwo.appendToTail(node2);
        listTwo.appendToTail(node3);
        listTwo.appendToTail(intersectionNode);


        assertSame(intersectionNode, intersection.returnIntersection(listOne, listTwo));
    }

    @Test
    public void testIntersectionUnevenLists(){
        Node one = new Node(5);
        Node two = new Node(1);
        Node three = new Node(4);
        Node four = new Node(55);
        Node five = new Node(88);
        Node six = new Node(124);

        Node node1 = new Node(6);
        Node node2 = new Node(2);
        Node node3 = new Node(7);

        Node intersectionNode = new Node(8);
        intersectionNode.setNext(new Node(15));

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);
        listOne.appendToTail(five);
        listOne.appendToTail(six);
        listOne.appendToTail(intersectionNode);

        MyLinkedList listTwo = new MyLinkedList(node1);
        listTwo.appendToTail(node2);
        listTwo.appendToTail(node3);
        listTwo.appendToTail(intersectionNode);


        assertSame(intersectionNode, intersection.returnIntersection(listOne, listTwo));
    }

    @Test
    public void testNoIntersection(){
        Node one = new Node(5);
        Node two = new Node(1);
        Node three = new Node(4);

        Node node1 = new Node(6);
        Node node2 = new Node(2);
        Node node3 = new Node(7);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);

        MyLinkedList listTwo = new MyLinkedList(node1);
        listTwo.appendToTail(node2);
        listTwo.appendToTail(node3);


        assertNull(intersection.returnIntersection(listOne, listTwo));
    }
}