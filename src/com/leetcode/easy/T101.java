package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-31
 * @time: 23:34
 */
public class T101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(3);
        System.out.println(new T101().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left == null || root.right == null){
            return false;
        }
        return isSymmetric(root.left) && isSymmetric(root.right) && root.left.val == root.right.val;
    }
}
