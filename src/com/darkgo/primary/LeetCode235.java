package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 二叉搜索树的最近公共祖先
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/16
 */
public class LeetCode235 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 两次遍历 获取p、q的公共路径，然后
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pPath = getPath(root, p);
        List<TreeNode> qPath = getPath(root, q);
        TreeNode ancestor = null;
        for (int i = 0; i < pPath.size() && i < qPath.size(); i++) {
            if (pPath.get(i) == qPath.get(i)) {
                ancestor = pPath.get(i);
            } else {
                break;
            }
        }
        return ancestor;
    }

    private List<TreeNode> getPath(TreeNode root, TreeNode node) {
        List<TreeNode> list = new ArrayList<>();
        while (root != null) {
            if (node.val < root.val) {
                root = root.left;
            } else if (node.val > root.val) {
                root = root.right;
            } else {
                return list;
            }
        }
        return list;
    }

    /**
     * 一次遍历
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    private TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (ancestor != null) {
            if (ancestor.val < p.val && ancestor.val < q.val) {
                ancestor = ancestor.right;
            } else if (ancestor.val > p.val && ancestor.val > q.val) {
                ancestor = ancestor.left;
            } else {
                break;
            }
        }
        return ancestor;
    }
}
