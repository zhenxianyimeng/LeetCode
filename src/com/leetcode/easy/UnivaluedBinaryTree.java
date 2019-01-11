package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zjb
 * @date 2019/1/11.
 */
public class UnivaluedBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(9);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(1);
        treeNode.left.left = new TreeNode(9);
        treeNode.left.right = new TreeNode(9);
        treeNode.right.right = new TreeNode(9);
        System.out.println(isUnivalTree(treeNode));

    }

    public static boolean isUnivalTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        temp(root,set);
        if(set.size() == 1){
            return true;
        }
        return false;
    }

    private static void temp(TreeNode root, Set<Integer> set){
        if(set.size() > 1){
            return;
        }
        set.add(root.val);
        if(root.left != null){
            temp(root.left, set);
        }
        if(root.right != null){
            temp(root.right, set);
        }
    }
}
