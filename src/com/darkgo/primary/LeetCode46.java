package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 全排列
 * </p>
 * 回溯
 * @author ShiWu
 * @since 2022/9/8
 */
public class LeetCode46 {
    private static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        boolean[] used = new boolean[n];
        List<Integer> path = new ArrayList<>();

        dfs(nums, n, 0, path, used, ans);
        return ans;
    }

    private static void dfs(int[] nums, int n, int depth, List<Integer> path, boolean[] used, List<List<Integer>> ans) {
        if (depth == n) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                System.out.println("  递归之前 => " + path);
                dfs(nums, n, depth + 1, path, used, ans);
                System.out.println("  递归之后 => " + path);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2}));
    }
}
