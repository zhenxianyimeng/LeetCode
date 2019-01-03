package com.leetcode.medium;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;


/**
 * @author zjb
 * @date 2019/1/3.
 */
public class BinaryTreePruning {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(0);
        treeNode.right.left = new TreeNode(0);
        treeNode.right.right = new TreeNode(1);
        BinaryTreeUtils.printTreeNode(pruneTree(treeNode));
    }

    public static TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return root;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.val == 1 || root.left!=null || root.right!=null){
            return root;
        }
        return null;
    }
}
