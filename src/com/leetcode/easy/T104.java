package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-12-26
 * @time: 01:01
 */
public class T104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new T104().maxDepth(root));
        new T104().maxDepthStack(root);
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int maxDepthStack(TreeNode root) {
        if(root == null){
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode tmp = stack.pop();
            System.out.println(tmp.val);
            if (tmp.left != null){
                stack.push(tmp.left);
            }
            if (tmp.right != null){
                stack.push(tmp.right);
            }
        }
        return 0;
    }

}
