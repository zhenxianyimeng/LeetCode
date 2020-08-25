package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-08-25
 * @time: 19:40
 */
public class T337 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        System.out.println(new T337().rob(root));
    }

    public int rob(TreeNode root) {
        int[] arr = tempRob(root);
        return Math.max(arr[0], arr[1]);
    }

    /**
     * 返回int[]的长度为2，index=0表示返抢root的值，index=1表示不抢root
     * @param root
     * @return
     */
    private int[] tempRob(TreeNode root){
        if(root == null){
            return new int[]{0, 0};
        }
        int[] arr = new int[2];
        int[] letf = tempRob(root.left);
        int[] right = tempRob(root.right);
        //抢
        arr[0] = root.val + letf[1] + right[1];
        //不抢/
        arr[1] = Math.max(letf[0],letf[1]) + Math.max(right[0], right[1]);
        return arr;
    }
}
