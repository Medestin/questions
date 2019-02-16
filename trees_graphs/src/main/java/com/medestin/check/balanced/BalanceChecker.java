package com.medestin.check.balanced;

import com.medestin.TreeNode;

public class BalanceChecker {

    public boolean isBalanced(TreeNode root){
        return checkHeight(root) != Integer.MIN_VALUE;
    }

   private int checkHeight(TreeNode root){
       if (root == null){
           return -1;
       }

       int leftHeight = checkHeight(root.getChildren()[0]);
       if(leftHeight == Integer.MIN_VALUE) {
           return Integer.MIN_VALUE;
       }

       int rightHeight = checkHeight(root.getChildren()[1]);
       if(rightHeight == Integer.MIN_VALUE){
           return Integer.MIN_VALUE;
       }

       int heightDiff = Math.abs(leftHeight - rightHeight);
       if(heightDiff > 1){
           return Integer.MIN_VALUE;
       } else {
           return Math.max(leftHeight, rightHeight) + 1;
       }
   }
}
