package com.darkgo.primary;

/**
 * <p>
 * 移除元素
 * </p>
 * 双指针问题
 * @author ShiWu
 * @since 2022/4/29
 */
public class LeetCode27 {
    public static void main(String[] args) {
        // int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] nums = {3,2,2,3};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
    private static int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
