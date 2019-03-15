package com.leetcode.medium;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

/**
 * @author zjb
 * @date 2019/3/15.
 */
public class ConstructBinarySearchTreefromPreorderTraversal {
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        TreeNode root = bstFromPreorder(preorder);
        BinaryTreeUtils.printTreeNode(root);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node = tempTransform(preorder, 0, preorder.length -1);
        return node;
    }

    public static TreeNode tempTransform(int[] preorder, int l, int r){
        if(l==r){
            return new TreeNode(preorder[l]);
        }

        int middle = l;
        TreeNode treeNode = new TreeNode(preorder[l]);
        while (middle+1<=r && preorder[middle+1] < preorder[l] ){
            middle++;
        }
        if(middle == l){
            treeNode.left = null;
        }else {
            treeNode.left = tempTransform(preorder, l+1, middle);
        }

        if(middle == r){
            treeNode.right = null;
        }else {
            treeNode.right = tempTransform(preorder, middle+1, r);
        }

        return treeNode;
    }
}
