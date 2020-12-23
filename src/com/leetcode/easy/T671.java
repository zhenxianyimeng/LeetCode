package com.leetcode.easy;

import apple.laf.JRSUIUtils;
import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-12-23
 * @time: 19:39
 *   1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 *
 *
 */
public class T671 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.left.left = new TreeNode(5);
        t1.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.left.right = new TreeNode(4);
        t2.right = new TreeNode(3);
        t2.right.right = new TreeNode(7);
        BinaryTreeUtils.printTreeNode(new T671().mergeTrees(t1, t2));
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null){
            return null;
        }
        TreeNode t;
        if(t1!=null && t2==null){
            t =  new TreeNode(t1.val);
            t.right = mergeTrees(t1.right, null);
            t.left = mergeTrees(t1.left, null);
        }else if(t1==null && t2!=null){
            t = new TreeNode(t2.val);
            t.right = mergeTrees(null, t2.right);
            t.left = mergeTrees(null, t2.left);
        }else {
            t = new TreeNode(t1.val + t2.val);
            t.right = mergeTrees(t1.right, t2.right);
            t.left = mergeTrees(t1.left, t2.left);
        }
        return t;
    }
}
