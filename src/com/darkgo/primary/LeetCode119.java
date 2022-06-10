package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 杨辉三角 II
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/10
 */
public class LeetCode119 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            pre.add(0);
            for (int j = i; j >0; j--) {
                pre.set(j, pre.get(j) + pre.get(j - 1));
            }

        }
        return pre;
    }
}
