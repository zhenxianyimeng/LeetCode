package com.leetcode.medium;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-04
 * @time: 19:46
 */
public class T114 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        new T114().flatten(root);
        BinaryTreeUtils.printTreeNode(root);
    }

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        TreeNode before = null;

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left !=null){
                stack.push(node.left);
            }

            if (before != null) {
                before.right = node;
            }
            node.left = null;
            before = node;
        }
    }

    public void temp(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left !=null){
                stack.push(node.left);
            }
        }
    }


}
