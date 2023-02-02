package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/19
 */
public class LeetCode1061 {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Union union = new Union();
        for (int i = 0; i < s1.length(); i++) {
            union.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            int parent = union.findParent(baseStr.charAt(i) - 'a');
            sb.append('a' + parent);
        }
        return sb.toString();
    }

    class Union {
        int[] nums;

        Union() {
            nums = new int[26];
            for (int i = 0; i < 26; i++) {
                nums[i] = i;
            }
        }

        public void union(int x1, int x2) {
            int parent1 = findParent(x1);
            int parent2 = findParent(x2);
            if (parent1==parent2) {
                return;
            }
            if (parent1 < parent2) {
                nums[parent2] = parent1;
            } else {
                nums[parent1] = parent2;
            }
        }

        public int findParent(int x) {
            while (nums[x] != x) {
                x = findParent(nums[x]);
            }
            return x;
        }
    }
}
