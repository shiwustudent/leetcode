package com.darkgo.weekly;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/8
 */
public class weekly_contest_327 {
    public static void main(String[] args) {
        maxKelements(new int[]{1, 10, 3, 3, 3}, 3);
        // System.out.printf(String.valueOf(Math.ceil(3.3)));
    }

    private static long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            pq.offer(num);
        }
        for (int i = k; i > 0; i--) {
            Integer max = pq.poll();
            ans += max;
            int ceil = (max + 2) / 3;
            pq.offer(ceil);
        }
        return ans;
    }

    public boolean isItPossible(String word1, String word2) {
        char[] chars1 = new char[26];
        char[] chars2 = new char[26];
        for (char c : word1.toCharArray()) {
            chars1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            chars2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == j) {
                    continue;
                }
                chars1[i]--;
                chars2[i]++;
                chars1[j]++;
                chars2[j]--;
                int x = 0;
                for (int k = 0; k < 26; k++) {
                    if (chars1[k] > 0) {
                        x++;
                    }
                    if (chars2[k] > 0) {
                        x--;
                    }
                }
                if (x == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
