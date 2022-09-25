package com.darkgo.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * 第 312 场周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/25
 */
public class weekly_contest_312 {
    public static void main(String[] args) {
        goodIndices(new int[]{2, 1, 1, 1, 3, 4, 1}, 2);
    }

    private String[] sortPeople(String[] names, int[] heights) {

        List<People> list = new ArrayList<>();
        int n = names.length;
        for (int i = 0; i < n; i++) {
            list.add(new People(names[i], heights[i]));
        }
        list.sort((o1, o2) -> o2.height - o1.height);
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = list.get(i).name;
        }
        return ans;
    }

    class People {
        String name;
        int height;

        public People(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }

    private static int longestSubarray(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int max = Arrays.stream(nums).max().getAsInt();
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == max && nums[i + 1] == nums[i]) {
                cnt++;
            } else {
                ans = Math.max(cnt, ans);
                cnt = 1;
            }
        }
        return ans;
    }

    private static List<Integer> goodIndices(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = k; i < n - k; i++) {
            boolean left = true;
            for (int j = i - k; j < i; j++) {
                if (j < 0) {
                    continue;
                }
                if (nums[j] < nums[j + 1]) {
                    left = false;
                    break;
                }
            }
            boolean right = true;
            for (int j = i + 1; j <= i + k; j++) {
                if (j >= n) {
                    break;
                }
                if (nums[j] > nums[j+1]) {
                    right = false;
                    break;
                }
            }
            if (left && right) {
                list.add(i);
            }
        }
        return list;
    }
}
