package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 数组中重复的数据
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/8
 */
public class LeetCode442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates(nums);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
                list.add(num);
            }
        }
        return list;
    }
}

