package com.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zjb
 * @date 2018/7/3.
 */
public class MaximumBinaryTree {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        TreeNode treeNode = constructMaximumBinaryTree(nums);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode t = queue.pollFirst();
            System.out.println(t.val);
            if(t.left != null){
                queue.addLast(t.left);
            }
            if(t.right != null){
                queue.addLast(t.right);
            }
        }


    }



    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return subConstruct(nums, 0, nums.length);
    }

    public static TreeNode subConstruct(int[] nums, int l, int r){
        if(l >= r){
            return null;
        }
        int max = l;
        for (int i = l+1; i <r ; i++) {
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        TreeNode treeNode = new TreeNode(nums[max]);
        treeNode.left = subConstruct(nums, l, max);
        treeNode.right = subConstruct(nums, max+1, r);
        return treeNode;
    }

    private static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
}
