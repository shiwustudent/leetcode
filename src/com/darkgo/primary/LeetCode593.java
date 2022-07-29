package com.darkgo.primary;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 有效的正方形
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/29
 */
public class LeetCode593 {
    private boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        set.add(distance(p1, p2));
        set.add(distance(p1, p3));
        set.add(distance(p1, p4));
        set.add(distance(p2, p3));
        set.add(distance(p2, p4));
        set.add(distance(p3, p4));
        if (set.size() != 2) {
            return false;
        }
        //是不是根号2倍 平方就是2倍
        Integer[] array = set.toArray(new Integer[2]);
        if (array[0] > array[1]) {
            return array[0] == 2 * array[1];
        } else {
            return array[1] == 2 * array[0];
        }
    }

    private int distance(int[] p1, int[] p2) {
        int edge1 = p1[0] - p2[0];
        int edge2 = p1[1] - p2[1];
        return edge1 * edge1 + edge2 * edge2;
    }
}
