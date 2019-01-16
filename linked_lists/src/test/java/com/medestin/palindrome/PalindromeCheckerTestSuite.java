package com.medestin.palindrome;

import com.medestin.MyLinkedList;
import com.medestin.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTestSuite {
    private PalindromeChecker checker = new PalindromeChecker();

    @Test
    public void testIfUnevenPalindromePositive(){
        Node one = new Node(8);
        Node two = new Node(1);
        Node three = new Node(8);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);

        assertTrue(checker.isPalindrome(listOne));
    }

    @Test
    public void testIfUnevenPalindromeNegative(){
        Node one = new Node(8);
        Node two = new Node(1);
        Node three = new Node(9);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);

        assertFalse(checker.isPalindrome(listOne));
    }

    @Test
    public void testIfEvenPalindromePositive(){
        Node one = new Node(8);
        Node two = new Node(1);
        Node three = new Node(1);
        Node four = new Node(8);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);

        assertTrue(checker.isPalindrome(listOne));
    }

    @Test
    public void testIfEvenPalindromeNegative(){
        Node one = new Node(8);
        Node two = new Node(2);
        Node three = new Node(1);
        Node four = new Node(8);

        MyLinkedList listOne = new MyLinkedList(one);
        listOne.appendToTail(two);
        listOne.appendToTail(three);
        listOne.appendToTail(four);

        assertFalse(checker.isPalindrome(listOne));
    }

    @Test
    public void testIfLongPalindromePositive(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(5);
        Node seven = new Node(4);
        Node eight = new Node(3);
        Node nine = new Node(2);
        Node ten = new Node(1);

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

        assertTrue(checker.isPalindrome(listOne));
    }

    @Test
    public void testIfLongPalindromeNegative(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(4);
        Node eight = new Node(3);
        Node nine = new Node(2);
        Node ten = new Node(1);

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

        assertFalse(checker.isPalindrome(listOne));
    }
}