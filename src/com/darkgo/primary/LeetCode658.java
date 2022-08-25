package com.darkgo.primary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * 找到 K 个最接近的元素
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/25
 */
public class LeetCode658 {

    private List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (Math.abs(a - x) != Math.abs(b - x)) {
                    return Math.abs(a - x) - Math.abs(b - x);
                } else {
                    return a-b;
                }
            }
        });
        List<Integer> ans = list.subList(0, k);
        Collections.sort(ans);
        return ans;
    }
}
