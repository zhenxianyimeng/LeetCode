package com.leetcode.easy;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.BinaryTreeUtils.TreeNode;

/**
 * @author zjb
 * @date 2019/1/1.
 */
public class SearchinaBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        TreeNode result = searchBST(root, 2);
        BinaryTreeUtils.printTreeNode(result);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        while (temp!=null){
            if(temp.val > val){
                temp = temp.left;
            }else if(temp.val < val){
                temp = temp.right;
            }else {
                return temp;
            }
        }

        return temp;
    }
}
