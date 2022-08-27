package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 二叉树最大宽度
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/27
 */
public class LeetCode662 {
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

    //bfs
    private int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.add(new Pair<>(root, 1));
        int max = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Pair<TreeNode, Integer>> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> cell = queue.poll();
                if (cell.node.left != null) {
                    queue.offer(new Pair<>(cell.node.left, cell.id << 1));
                    list.add(new Pair<>(cell.node.left, cell.id << 1));
                }
                if (cell.node.right != null) {
                    queue.offer(new Pair<>(cell.node.right, cell.id << 1 | 1));
                    list.add(new Pair<>(cell.node.right, cell.id << 1 | 1));
                }
            }
            if (list.size() == 0) {
                break;
            }
            max = Math.max(max, list.get(list.size() - 1).id - list.get(0).id + 1);
        }
        return max;
    }

    private class Pair<T, I extends Number> {
        private TreeNode node;
        private Integer id;

        public Pair(TreeNode node, Integer id) {
            this.node = node;
            this.id = id;
        }
    }

    //dfs
    private int widthOfBinaryTree2(TreeNode root) {
        return preorder(root, 1, 1);
    }

    Map<Integer, Integer> map = new HashMap<>();

    private int preorder(TreeNode root, int depth, int index) {
        if (root == null) {
            return 0;
        }
        map.putIfAbsent(depth, index);
        return Math.max(index - map.get(depth) + 1, Math.max(preorder(root.left, depth + 1, index << 1), preorder(root.right, depth + 1, index << 1 | 1)));
    }
}
