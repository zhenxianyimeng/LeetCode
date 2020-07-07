package com.leetcode.easy;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-07
 * @time: 19:06
 */
public class T112 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
//        BinaryTreeUtils.printTreeNode(root);
        System.out.println(new T112().hasPathSum(root, 22));
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right==null && sum == root.val){
            return true;
        }
        boolean left = false;
        if(root.left != null){
             left = hasPathSum(root.left, sum - root.val);
        }
        boolean right = false;
        if(root.right != null){
            right = hasPathSum(root.right, sum - root.val);
        }
        return right || left;
    }
}
