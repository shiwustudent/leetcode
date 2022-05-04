package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 杨辉三角
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/4
 */
public class LeetCode118 {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(new Solution().generate(numRows));
    }

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> rows = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        rows.add(1);
                    } else {
                        List<Integer> list1 = list.get(i - 1);
                        rows.add(list1.get(j - 1) + list1.get(j));
                    }
                }
                list.add(rows);
            }
            return list;
        }
    }
}
