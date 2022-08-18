package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <p>
 * 层数最深叶子节点的和
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/17
 */
public class LeetCode1302 {
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

    //method 1 dfs
    private int deepestLeavesSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int level = 0;
        preorder(root, list, level);
        return list.get(list.size() - 1);
    }

    private void preorder(TreeNode node, List<Integer> list, int level) {
        if (node == null) {
            return;
        }
        if (list.get(level) == null) {
            list.add(node.val);
        } else {
            list.set(level, list.get(level) + node.val);
        }
        preorder(node.left, list, level + 1);
        preorder(node.right, list, level + 1);
    }

    // method 2 bfs
    private int deepestLeavesSum2(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ans = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                ans += poll.val;
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return ans;
    }
}
