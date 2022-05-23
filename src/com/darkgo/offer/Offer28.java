package com.darkgo.offer;

/**
 * <p>
 * 对称的二叉树
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/23
 */
public class Offer28 {
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
    private boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    private boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(q.right, p.left);
    }
}
