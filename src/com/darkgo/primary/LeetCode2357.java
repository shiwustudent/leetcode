package com.darkgo.primary;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/24
 */
public class LeetCode2357 {
    private int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num != 0) {
                set.add(num);
            }

        }
        return set.size();
    }
}
