package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description:
 * 好题目
 * @author: chixiao
 * @date: 2020-05-13
 * @time: 21:32
 */
public class T102 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new T102().levelOrder(root));
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode n = queue.poll();
                levelList.add(n.val);
                if(n.left != null){
                    queue.add(n.left);
                }
                if(n.right != null){
                    queue.add(n.right);
                }
            }
            list.add(levelList);
        }
        return list;
    }
}
