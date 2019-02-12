package com.medestin.list.of.depths;

import com.medestin.TreeNode;

import java.util.ArrayList;

public class DepthLists {

    public ArrayList<ArrayList<TreeNode>> createDepthLists(TreeNode root){
        ArrayList<ArrayList<TreeNode>> depthLists = new ArrayList<>();
        if(root == null){
            return depthLists;
        }

        ArrayList<TreeNode> currentDepth = new ArrayList<>();
        currentDepth.add(root);
        depthLists.add(currentDepth);

        createSingleDepth(depthLists, currentDepth);
        return depthLists;
    }

    private void createSingleDepth(ArrayList<ArrayList<TreeNode>> depthLists, ArrayList<TreeNode> previousDepth){
        ArrayList<TreeNode> currentDepth = new ArrayList<>();
        for(TreeNode node : previousDepth){
            for(TreeNode child : node.getChildren())
                if(child != null){
                    currentDepth.add(child);
                }
        }
        if(!currentDepth.isEmpty()){
            depthLists.add(currentDepth);
            createSingleDepth(depthLists, currentDepth);
        }
    }
}
