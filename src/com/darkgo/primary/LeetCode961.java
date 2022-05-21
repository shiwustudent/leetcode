package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 在长度 2N 的数组中找出重复 N 次的元素
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/21
 */
public class LeetCode961 {
    public static void main(String[] args) {

    }
    private  int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            if (count + 1 == 2) {
                return num;
            } else {
                map.put(num, count + 1);
            }
        }
        return 0;
    }
}
