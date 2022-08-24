package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 通过翻转子数组使两个数组相等
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/24
 */
public class LeetCode1460 {
    private boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target,arr);
    }
}
