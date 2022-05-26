package com.darkgo.primary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 存在重复元素
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/26
 */
public class LeetCode217 {
    public static void main(String[] args) {

    }

    private boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDuplicate1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer cnt = map.getOrDefault(num, 0);
            if (cnt==1) {
                return true;
            }
            map.put(num, cnt + 1);
        }
        return false;
    }
}
