package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 两棵二叉搜索树中的所有元素
 * </p>
 * 递归
 *
 * @author ShiWu
 * @since 2022/5/1
 */
public class LeetCode1305 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1, treeNode1, treeNode3);
        getAllElements(treeNode2, treeNode1);
    }

    // Definition for a binary tree node.
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

    private static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        inorder(root1, list);
        inorder(root2, list);
        Arrays.sort(list.toArray());
        Collections.sort(list);
        return list;
    }

    private static void inorder(TreeNode node, List<Integer> res) {
        if (node != null) {
            inorder(node.left, res);
            inorder(node.right, res);
            res.add(node.val);
        }
    }

}
