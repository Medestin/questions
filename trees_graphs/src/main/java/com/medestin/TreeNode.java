package com.medestin;

public class TreeNode {
    private int value;
    private final TreeNode[] children = new TreeNode[2];

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode[] getChildren() {
        return children;
    }
}
