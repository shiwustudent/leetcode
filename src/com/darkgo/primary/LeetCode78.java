package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/19
 */
public class LeetCode78 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        dfs(list, nums, 0);
        return ans;
    }

    private void dfs(List<Integer> list, int[] nums, int cur) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[cur]);
        dfs(list, nums, cur + 1);
        list.remove(list.size() - 1);
        dfs(list, nums, cur + 1);
    }
}
