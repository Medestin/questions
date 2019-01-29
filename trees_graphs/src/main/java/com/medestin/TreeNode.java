package com.medestin;

import java.util.ArrayList;

public class TreeNode {
    private int value;
    private final ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }
}
