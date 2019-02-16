package com.medestin.check.balanced;

import com.medestin.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalanceCheckerTestSuite {
    private BalanceChecker balanceChecker = new BalanceChecker();

    @Test
    public void testPerfectlyBalancedTree(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(1);

        node1.getChildren()[0] = node2;
        node1.getChildren()[1] = node3;

        node2.getChildren()[0] = node4;
        node2.getChildren()[1] = node5;

        node3.getChildren()[0] = node6;
        node3.getChildren()[1] = node7;

        assertTrue(balanceChecker.isBalanced(node1));
    }

    @Test
    public void testBalancedTree(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);

        node1.getChildren()[0] = node2;
        node1.getChildren()[1] = node3;

        node2.getChildren()[0] = node4;
        node2.getChildren()[1] = node5;

        assertTrue(balanceChecker.isBalanced(node1));
    }


    @Test
    public void testUnbalancedTree(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(1);

        node1.getChildren()[0] = node2;
        node1.getChildren()[1] = node3;

        node2.getChildren()[0] = node4;
        node2.getChildren()[1] = node5;

        node4.getChildren()[0] = node6;
        node4.getChildren()[1] = node7;

        assertFalse(balanceChecker.isBalanced(node1));
    }
}