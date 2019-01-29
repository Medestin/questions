package com.medestin.minimal.tree;

import com.medestin.TreeNode;

public class MinimalTree {

    public TreeNode createMinimalBST(int[] sortedUniqueArray){
        return recursiveBSTCreation(sortedUniqueArray, 0, sortedUniqueArray.length-1);
    }

    private TreeNode recursiveBSTCreation(int[] array, int startPoint, int endPoint){
        if(endPoint - startPoint <= 1){
             return createLeaves(array, startPoint, endPoint);
        }

        int middle = (startPoint + endPoint + 1)/2;
        TreeNode parent = new TreeNode(array[middle]);
        parent.getChildren().add(recursiveBSTCreation(array, startPoint, middle-1));
        parent.getChildren().add(recursiveBSTCreation(array, middle +1, endPoint));

        return parent;
    }

    private TreeNode createLeaves(int[] array, int startPoint, int endPoint){
         if (endPoint - startPoint == 1){
            TreeNode parent = new TreeNode(array[endPoint]);
            parent.getChildren().add(new TreeNode(array[startPoint]));
            return parent;
        } else {
             return new TreeNode(array[endPoint]);
        }
    }
}
