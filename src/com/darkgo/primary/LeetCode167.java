package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 两数之和 II - 输入有序数组
 * </p>
 *
 * @author ShiWu
 * @since 2022/4/28
 */
public class LeetCode167 {
    public static void main(String[] args) {
        // int[] numbers = {2, 7, 11, 15};
        int[] numbers = {2, 3, 4};
        // int target = 9;
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    private static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (true) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
