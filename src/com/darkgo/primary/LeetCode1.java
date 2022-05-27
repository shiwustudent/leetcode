package com.darkgo.primary;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <p>
 * 两数之和
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/27
 */
public class LeetCode1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 10}, 9)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
