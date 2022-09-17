package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 最多能完成排序的块 II
 * </p>
 *
 *
 * @author ShiWu
 * @since 2022/8/13
 */
public class LeetCode768 {
    // 单调栈
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i : arr) {
            if (stack.isEmpty() || i >= stack.peek()) {
                stack.push(i);
            } else {
                int mx = stack.pop();
                while (!stack.isEmpty() && stack.peek() > i) {
                    stack.pop();
                }
                stack.push(mx);
            }
        }
        return stack.size();
    }

    //排序 map
    public int maxChunksToSorted1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int[] sortedArr = new int[n];
        System.arraycopy(arr, 0, sortedArr, 0, n);
        Arrays.sort(sortedArr);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i], y = sortedArr[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) == 0) {
                map.remove(x);
            }
            map.put(y, map.getOrDefault(y, 0) - 1);
            if (map.get(y) == 0) {
                map.remove(y);
            }
            if (map.isEmpty()) {
                ans++;
            }
        }
        return ans;
    }
}
