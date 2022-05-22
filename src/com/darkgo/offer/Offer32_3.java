package com.darkgo.offer;

import java.util.*;

/**
 * <p>
 * 从上到下打印二叉树 III
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/21
 */
public class Offer32_3 {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return list;
        }
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (reverse) {
                Collections.reverse(level);
            }
            reverse = !reverse;
            list.add(level);
        }
        return list;
    }
}
