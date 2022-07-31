package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 最大层内元素和
 * //TODO 深度优先解法
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/31
 */
public class LeetCode1161 {
    public static void main(String[] args) {

    }

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

    private int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int ans = 1;
        int cnt = 1;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.size() != 0) {
            int size = queue.size();
            int current = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                current += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (current > max) {
                max = current;
                ans = cnt;
            }
            cnt++;
        }
        return ans;
    }
}
