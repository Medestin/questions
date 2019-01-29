package com.medestin.minimal.tree;

import com.medestin.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MinimalTreeTestSuite {
    private MinimalTree minimalTree = new MinimalTree();

    @Test
    public void testMinimalTree() {
        int[] array = new int[(int) (Math.random() * 50) + 3];

        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }

        TreeNode root = minimalTree.createMinimalBST(array);
        TreeNode left = root.getChildren().get(0);
        TreeNode right = root.getChildren().get(1);

        assertTrue(root.getValue() > left.getValue());
        assertTrue(root.getValue() < right.getValue());
    }
}