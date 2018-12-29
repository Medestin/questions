package com.medestin;

public class MyLinkedList {
    private Node headNode;

    public MyLinkedList(Node headNode) {
        this.headNode = headNode;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public void appendToTail(Node node){
        Node currentNode = headNode;

        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(node);
    }
}
