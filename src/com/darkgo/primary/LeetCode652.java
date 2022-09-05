package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 寻找重复的子树
 * </p>
 * todo 补充另一种解法
 * @author ShiWu
 * @since 2022/9/5
 */
public class LeetCode652 {
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

    Map<String, TreeNode> map = new HashMap<>();
    Set<TreeNode> repeat = new HashSet<>();

    private List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(repeat);
    }

    private String dfs(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("(");
        sb.append(dfs(root.left));
        sb.append(")(");
        sb.append(dfs(root.right));
        sb.append(")");
        String s = sb.toString();
        if (map.containsKey(s)) {
            repeat.add(map.get(s));
        } else {
            map.put(s, root);
        }
        return s;
    }
}
