package com.darkgo.primary;

/**
 * <p>
 * 最大连续 1 的个数
 * </p>
 *
 * @author ShiWu
 * @since 2022/4/29
 */
public class LeetCode485 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    private static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int one = 0;
        for (int num : nums) {
            if (num == 0) {
                ans = Math.max(ans, one);
                one = 0;
            } else {
                one++;
            }
        }
        ans = Math.max(ans, one);
        return ans;
    }
}
