package com.darkgo.primary;

/**
 * <p>
 * 最长同值路径
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/2
 */
public class LeetCode687 {
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

    private int max = 0;

    private int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    // 中序遍历
    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        int left1 = 0, right1 = 0;
        if (node.left != null && node.left.val == node.val) {
            left1 = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            right1 = right + 1;
        }
        max = Math.max(max, left1 + right1);
        return Math.max(left1, right1);
    }
}
