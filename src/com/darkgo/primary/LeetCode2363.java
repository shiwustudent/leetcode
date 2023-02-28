package com.darkgo.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/28
 */
public class LeetCode2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1, (o1, o2) -> {
            if (o1[0] - o2[0] != 0) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        Arrays.sort(items2, (o1, o2) -> {
            if (o1[0] - o2[0] != 0) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        List<List<Integer>> ans = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1 < items1.length && index2 < items2.length) {
            List<Integer> list = new ArrayList<>();
            if (items1[index1][0] == items2[index2][0]) {
                list.add(items1[index1][0]);
                list.add(items1[index1][1] + items2[index2][1]);
                ans.add(list);
                index1++;
                index2++;
            } else if (items1[index1][0] < items2[index2][0]) {
                list.add(items1[index1][0]);
                list.add(items1[index1][1]);
                ans.add(list);
                index1++;
            } else {
                list.add(items2[index2][0]);
                list.add(items2[index2][1]);
                ans.add(list);
                index2++;
            }

        }
        test(items1, ans, index1);
        test(items2, ans, index2);
        return ans;

    }

    private void test(int[][] items2, List<List<Integer>> ans, int index2) {
        while (index2 < items2.length) {
            List<Integer> list = new ArrayList<>();
            list.add(items2[index2][0]);
            list.add(items2[index2][1]);
            ans.add(list);
            index2++;
        }
    }
}
