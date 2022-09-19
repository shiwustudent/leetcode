package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 按照频率将数组升序排序
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/19
 */
public class LeetCode1636 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            list.add(num);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = map.get(o1);
                Integer i2 = map.get(o2);

                return Objects.equals(i1, i2) ? o2 - o1 : i1 - i2;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
