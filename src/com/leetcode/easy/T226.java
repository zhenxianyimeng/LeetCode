package com.leetcode.easy;

import com.leetcode.medium.BattleshipsInABoard;
import com.leetcode.utils.BinaryTreeUtils;
import com.leetcode.utils.TreeNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-12-24
 * @time: 23:48
 */
public class T226 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        BinaryTreeUtils.printTreeNode(new T226().invertTree(root));
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode left = invertTree(root.right);

        TreeNode rignt = invertTree(root.left);
        root.left = left;
        root.right = rignt;
        return root;
    }
}
