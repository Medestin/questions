package com.medestin.intersection;

import com.medestin.MyLinkedList;
import com.medestin.Node;

public class Intersection {

    public Node returnIntersection(MyLinkedList listOne, MyLinkedList listTwo){
        int sizeOne = listOne.size();
        int sizeTwo = listTwo.size();

        Node currentOne;
        Node currentTwo;

        if(sizeOne == sizeTwo){
            currentOne = listOne.getHeadNode();
            currentTwo = listTwo.getHeadNode();

        } else {
            MyLinkedList longerList;
            MyLinkedList shorterList;
            int lengthDiff;

            if(sizeOne > sizeTwo){
               longerList = listOne;
               shorterList = listTwo;
               lengthDiff = sizeOne - sizeTwo;
            } else {
                longerList = listTwo;
                shorterList = listOne;
                lengthDiff = sizeTwo - sizeOne;
            }

            currentOne = longerList.getHeadNode();
            currentTwo = shorterList.getHeadNode();

            for(int i = 0; i < lengthDiff; ++i){
                currentOne = currentOne.getNext();
            }
        }

        while(currentOne != null){
            if(currentOne == currentTwo){
                return currentOne;
            }
            currentOne = currentOne.getNext();
            currentTwo = currentTwo.getNext();
        }
        return null;
    }
}
