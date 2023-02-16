package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 数组能形成多少数对
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/16
 */
public class LeetCode2341 {
    private int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) == 1) {
                map.put(num, 0);
                ans[0]++;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        ans[1] = nums.length - ans[0] * 2;
        return ans;
    }
}
