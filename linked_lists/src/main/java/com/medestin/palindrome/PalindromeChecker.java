package com.medestin.palindrome;

import com.medestin.MyLinkedList;
import com.medestin.Node;

public class PalindromeChecker {

    public boolean isPalindrome(MyLinkedList list){
        MyLinkedList reversedList = createReversedList(list);

        Node current = list.getHeadNode();
        Node reversedCurrent = reversedList.getHeadNode();

        if(current.getValue() != reversedCurrent.getValue()){
            return false;
        }

        while(current.getNext() != null){
            current = current.getNext();
            reversedCurrent = reversedCurrent.getNext();
            if(current.getValue() != reversedCurrent.getValue()){
                return false;
            }
        }
        return true;
    }

    private MyLinkedList createReversedList(MyLinkedList list){
        if(list.getHeadNode() == null){
            return null;
        }

        Node current = list.getHeadNode();

        Node reverseNext;
        Node reverseCurrent = new Node(current.getValue());

        while(current.getNext() != null){
            current = current.getNext();

            reverseNext = reverseCurrent;
            reverseCurrent = new Node(current.getValue());
            reverseCurrent.setNext(reverseNext);
        }

        return new MyLinkedList(reverseCurrent);
    }
}
