package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/17
 */
public class LeetCode1814 {
    private int countNicePairs(int[] nums) {
        int MOD = 1000000007;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            int rev = 0, temp = num;
            while (temp > 0) {
                int re = temp % 10;
                rev = rev * 10 + re;
                temp /= 10;
            }
            ans += map.getOrDefault(num - rev, 0) % MOD;
            map.put(num - rev, map.getOrDefault(num - rev, 0) + 1);
        }
        return ans;
    }
}
