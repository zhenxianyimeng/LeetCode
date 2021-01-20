package com.leetcode.hard;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.ListNode;
import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-19
 * @time: 20:15
 */
public class T99 {
    public void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        List<TreeNode> list = new ArrayList();
        traverse(root, list);
        if(list.size() == 1){
            return;
        }
        TreeNode before = null;
        TreeNode after = null;
        int i;
        for (i = 0; i <list.size()-1 ; i++) {
            if( list.get(i).val > list.get(i+1).val ) {
                after = list.get(i+1);
                if(before == null){
                    before = list.get(i);
                }
            }
        }
//        if(after == null && list.get(i).val > list.get(i+1).val){
//            after = list.get(i+1);
//        }
        if(before!= null && after!= null){
            int temp = before.val;
            before.val = after.val;
            after.val = temp;
        }

    }

    public void traverse(TreeNode root, List list){
        if(root == null){
            return;
        }
        traverse(root.left, list);
        list.add(root);
        traverse(root.right, list);
    }

    public static void main(String[] args) {
//        TreeNode head = new TreeNode(3);
//        head.left = new TreeNode(1);
//        head.right = new TreeNode(4);
//        head.right.left = new TreeNode(2);

        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(3);
//        head.right = new TreeNode(4);
        head.left.right = new TreeNode(2);
        new T99().recoverTree(head);
        BinaryTreeUtils.printTreeNode(head);
    }
}
