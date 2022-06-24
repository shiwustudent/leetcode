package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * <p>
 * 找树左下角的值
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/24
 */
public class LeetCode513 {
    public static void main(String[] args) {

    }


    private static class TreeNode {
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

    /**
     * 深度优先遍历
     */
    int maxHeight = 0;
    int val = 0;

    private int findBottomLeftValueDfs(TreeNode root) {
        int current = 0;
        dfs(root, current);
        return val;
    }

    private void dfs(TreeNode root, int current) {
        if (root == null) {
            return;
        }
        current++;
        dfs(root.left, current);
        dfs(root.right, current);
        if (current > maxHeight) {
            val = root.val;
            maxHeight = current;
        }
    }
    //广度优先遍历
    private int findBottomLeftValue(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll.right != null) {
                queue.offer(poll.right);
            }
            if (poll.left != null) {
                queue.offer(poll.right);
            }
            ans = poll.val;
        }
        return ans;
    }
}
