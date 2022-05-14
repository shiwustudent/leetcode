package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 随机数索引
 * </p>
 * 方法1：
 * Hashmap保存，key代表num，value采用list保存Index
 * 时间O(n)
 * 空间O(n)存储所有下标
 * <p>
 * 方法2：
 * 水塘抽样
 *
 * @author ShiWu
 * @since 2022/4/25
 */
public class LeetCode398 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3, 3};
        Solution solution = new Solution(nums);
        System.out.println(solution.pick(3));
        System.out.println(solution.pick(1));
    }

    private static class Solution {
        HashMap<Integer, List<Integer>> map = new LinkedHashMap<>();

        public Solution(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                map.putIfAbsent(nums[i], new ArrayList<Integer>());
                map.get(nums[i]).add(i);
            }
        }

        public int pick(int target) {
            List<Integer> list = map.get(target);
            return list.get(new Random().nextInt(list.size()));
        }
    }

    private static class Solution1 {
        int[] nums;
        Random random = new Random();

        public Solution1(int[] nums) {
            this.nums = nums;
        }

        public int pick(int target) {
            int ans = 0;
            for (int i = 0, count = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    ++count;
                    // 第 cnt 次遇到 target
                    if (random.nextInt(count) == 0) {
                        ans = i;
                    }
                }
            }
            return ans;
        }
    }
}
