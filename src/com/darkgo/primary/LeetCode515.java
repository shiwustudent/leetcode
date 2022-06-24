package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <p>
 * 在每个树行中找最大值
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/24
 */
public class LeetCode515 {
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

    //广度优先算法
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            while (size > 0) {
                size--;
                TreeNode node = queue.poll();
                if (node.val > max) {
                    max = node.val;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }

    //深度优先算法
    public List<Integer> largestValuesDFS(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        int current = -1;
        List<Integer> ans = new ArrayList<>();
        dfs(root, current,ans);
        return  ans;
    }

    private void dfs(TreeNode root, int current,List<Integer> ans) {
        if (root == null) {
            return;
        }
        current++;
        if (current == ans.size()) {
            ans.add(root.val);
        } else {
            ans.set(current, Math.max(root.val, ans.get(current)));
        }
        dfs(root.left, current, ans);
        dfs(root.right, current, ans);

    }
}
