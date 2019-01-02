package com.leetcode.utils;

import com.leetcode.medium.InsertIntoABinarySearchTree;
import com.leetcode.medium.MaximumBinaryTree;

import java.util.LinkedList;

/**
 * @author zjb
 * @date 2019/1/2.
 */
public class BinaryTreeUtils {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    public static void printTreeNode(TreeNode treeNode){
        if(treeNode == null){
            System.out.println("null");
            return;
        }
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
}
