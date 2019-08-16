package com.leetcode.medium;

import com.leetcode.utils.ListUtils;
import com.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-08-16
 * @time: 20:17
 */
public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        String str = String.join(",", binaryTreeInorderTraversal.inorderTraversal(root).stream().map(s->String.valueOf(s)).collect(Collectors.toList()));
        System.out.println(str);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        temp(root,list);
        return list;
    }

    public void temp(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            temp(root.left, list);
        }
        list.add(root.val);
        if(root.right != null){
            temp(root.right, list);
        }
    }
}
