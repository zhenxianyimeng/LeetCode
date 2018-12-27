package com.leetcode.medium;

import java.util.LinkedList;

/**
 * @author zjb
 * @date 2018/12/27.
 */
public class InsertIntoABinarySearchTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        TreeNode t = insertIntoBST(treeNode, 4);
        printTreeNode(t);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(val > root.val){
            if(root.right == null){
                root.right = new TreeNode(val);
            }else {
                root.right = insertIntoBST(root.right, val);
            }
        }else {
            if(root.left == null){
                root.left = new TreeNode(val);
            }else {
                root.left = insertIntoBST(root.left, val);
            }
        }
        return root;
    }

//    public static TreeNode sunInsert(TreeNode root, int val)

    public static void printTreeNode(TreeNode treeNode){
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


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
