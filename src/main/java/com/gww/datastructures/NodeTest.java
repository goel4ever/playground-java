package com.gww.datastructures;

public class NodeTest {
    public static void main(String[] args) {
        Node firstNode = new Node();
        firstNode.setValue(1);

        Node secondNode = new Node();
        secondNode.setValue(2);
        firstNode.setNext(secondNode);

        Node lastNode = new Node();
        lastNode.setValue(3);
        secondNode.setNext(lastNode);

    }
}
