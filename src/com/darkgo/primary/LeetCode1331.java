package com.darkgo.primary;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <p>
 * 数组序号转换
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/28
 */
public class LeetCode1331 {
    private int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(arr);
        int n = arr.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], map.size() + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
