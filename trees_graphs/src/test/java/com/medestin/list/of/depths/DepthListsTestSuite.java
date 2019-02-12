package com.medestin.list.of.depths;

import com.medestin.TreeNode;
import com.medestin.minimal.tree.MinimalTree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DepthListsTestSuite {
    private DepthLists depthLister = new DepthLists();

    @Test
    public void testDepthListsForNulls(){
        TreeNode root = createTree();
        ArrayList<ArrayList<TreeNode>> depthLists = depthLister.createDepthLists(root);

        for (ArrayList<TreeNode> depthList : depthLists) {
            for (TreeNode treeNode : depthList) {
                assertNotNull(treeNode);
            }
        }
    }

    @Test
    public void testDepthListsForAppropriateSizes(){
        TreeNode root = createTree();
        ArrayList<ArrayList<TreeNode>> depthLists = depthLister.createDepthLists(root);

        for(int i = 1; i < depthLists.size()-1; ++i){
            assertEquals(depthLists.get(i - 1).size() * 2, depthLists.get(i).size());
        }
    }

    @Test
    public void testDepthListsWithNullRoot(){
        ArrayList<ArrayList<TreeNode>> depthLists = depthLister.createDepthLists(null);
        assertTrue(depthLists.isEmpty());
    }

    private TreeNode createTree(){
        MinimalTree minimalTree = new MinimalTree();
        int[] array = new int[(int) (Math.random() * 100) + 3];

        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }
        return minimalTree.createMinimalBST(array);
    }
}