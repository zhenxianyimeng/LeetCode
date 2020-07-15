package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-14
 * @time: 14:49
 */
public class T111 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new T111().minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i <n ; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return depth;
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
