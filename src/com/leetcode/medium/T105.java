package com.leetcode.medium;

import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-22
 * @time: 18:51
 */
public class T105 {
    Map<Integer, Integer> inorderMap ;

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        BinaryTreeUtils.printTreeNode(new T105().buildTree(preorder, inorder));
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preRight = preorder.length - 1;
        int inRight = inorder.length - 1;
        inorderMap = new HashMap<>();
        for (int i = 0; i <inorder.length ; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preRight, 0, inRight);
    }

    private TreeNode buildTree(int[] preorder, int preLeft,
                               int preRight, int inLeft, int inRight){
        if (preLeft > preRight){
            return null;
        }
        int root = preorder[preLeft];
        Integer rootIndex = inorderMap.get(root);
        int lSize = rootIndex - inLeft;
        int rSize = inRight - rootIndex;
        TreeNode rootNode = new TreeNode(root);
        rootNode.left = buildTree(preorder, preLeft+1, preLeft + lSize,
                rootIndex-lSize, rootIndex-1);

        rootNode.right = buildTree(preorder, preLeft + lSize + 1 , preRight,
                rootIndex+1, inRight);

        return rootNode;
    }
}
