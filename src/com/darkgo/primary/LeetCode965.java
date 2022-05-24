package com.darkgo.primary;


/**
 * <p>
 * 单值二叉树
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/24
 */
public class LeetCode965 {
    public static void main(String[] args) {

    }
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        return check(value,root);
    }

    private boolean check(int value, TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.val != value) {
            return false;
        }
        return check(value, root.left) && check(value, root.right);
    }
}
