package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/17
 */
public class LeetCode904 {
    private int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0, ans = 0, right = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        while (right < n) {
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.getOrDefault(fruits[left], 0) - 1);
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
