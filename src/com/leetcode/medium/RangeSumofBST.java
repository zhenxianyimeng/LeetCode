package com.leetcode.medium;

/**
 * @author zjb
 * @date 2018/12/18.
 */
public class RangeSumofBST {

    //root = [10,5,15,3,7,null,18], L = 7, R = 15
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        treeNode.right.right = new TreeNode(18);
        System.out.println(rangeSumBST(treeNode, 7,15 ));
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {

        return tempSum(root, L, R);
    }

    public static int tempSum(TreeNode root, int L, int R){
        if(root == null){
            return 0;
        }
        if(root.val >=L && root.val <= R){
//            System.out.println(root.val);
            return root.val + tempSum(root.left, L, R) + tempSum(root.right, L, R);
        }
        if(root.val < L){
            return tempSum(root.right, L, R);
        }
        if(root.val > R){
            return tempSum(root.left, L, R);
        }
        return 0;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

}
