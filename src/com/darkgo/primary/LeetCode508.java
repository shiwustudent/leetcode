package com.darkgo.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 出现次数最多的子树元素和
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/19
 */
public class LeetCode508 {
    public static void main(String[] args) {

    }

    private HashMap<Integer, Integer> map = new HashMap<>();
    private int max = 0;
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

    private int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private int  dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = root.val + dfs(root.left) + dfs(root.right);
        int cnt = map.getOrDefault(sum, 0) + 1;
        map.put(sum, cnt);
        max = Math.max(max, cnt);
        return sum;
    }
}
