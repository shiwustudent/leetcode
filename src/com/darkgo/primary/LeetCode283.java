package com.darkgo.primary;

/**
 * <p>
 * 移动0
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/7
 */
public class LeetCode283 {
    public static void main(String[] args) {

    }

    private void moveZeroes(int[] nums) {
        int slow = 0,fast = 0,n=nums.length;
        while (fast < n) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
    }

}
