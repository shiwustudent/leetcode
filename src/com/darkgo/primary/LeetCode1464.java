package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <p>
 * 数组中两元素的最大乘积
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/26
 */
public class LeetCode1464 {
    //sort
    private int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }

    //pq
    private int maxProduct2(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int num : nums) {
            pq.offer(num);
        }
        return (pq.poll() - 1) * (pq.poll() - 1);

    }
}
