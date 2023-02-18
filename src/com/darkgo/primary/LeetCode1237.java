package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/18
 */
public class LeetCode1237 {

    class CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public int f(int x, int y) {
            return x + y;
        }
    }

    private List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            int left = 1, right = 1000;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (customfunction.f(i, mid) == z) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(mid);
                    ans.add(list);
                    break;
                } else if (customfunction.f(i, mid) < z) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return ans;
    }
}
