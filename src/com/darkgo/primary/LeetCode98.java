package com.darkgo.primary;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>
 * 验证二叉搜索树
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/16
 */
public class LeetCode98 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Method 1 recursion，
    // 首先，两个最大的数，当前节点大于最小的数并小于最大的数；
    // 当前节点的左节点，大于最小的数并小于当前节点的值；
    // 当前节点的右节点，大于上一个节点的数，并小于最大的数；
    // 递归
    private boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST(node.left, node.val, upper) && isValidBST(node.right, lower, node.val);
    }

    long pre = Long.MIN_VALUE;

    private boolean isValidBST2(TreeNode root) {
        return inorder(root);
    }
    // inorder left<root<right，左<根<右节点
    private boolean inorder(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = inorder(root.left);
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        boolean right = inorder(root.right);
        return left && right;
    }
}
