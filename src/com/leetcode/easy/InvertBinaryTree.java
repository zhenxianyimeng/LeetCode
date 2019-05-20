package com.leetcode.easy;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-05-20
 * @time: 19:43
 */
public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        InvertBinaryTree binaryTree = new InvertBinaryTree();
        TreeNode result = binaryTree.invertTree(root);
        BinaryTreeUtils.printTreeNode(result);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode l = null;
        TreeNode r = null;
        if(root.left !=null){
            r = invertTree(root.left);
        }
        if(root.right != null){
            l = invertTree(root.right);
        }
        root.left = l;
        root.right = r;
        return root;
    }
}
