package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 * 301场周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/10
 */
public class weekly_contest_301 {
    public static void main(String[] args) {

    }

    private int fillCups(int[] amount) {
        Arrays.sort(amount);
        int min = amount[0];
        int mid = amount[1];
        int max = amount[2];
        int ans = 0;
        ans += min * 2;
        max = max - min;
        ans += Math.min(max, mid) * 2;
        max = max - mid;
        ans += Math.abs(max - mid);
        return ans;
    }

    private class SmallestInfiniteSet {
        Set<Integer> set;

        public SmallestInfiniteSet() {
            set = new TreeSet<>();
            for (int i = 0; i < 1001; i++) {
                set.add(i);
            }
        }

        public int popSmallest() {
            Iterator<Integer> iterator = set.iterator();
            int i = iterator.next();
            set.remove(i);
            return i;
        }

        public void addBack(int num) {
            set.add(num);
        }
    }

    private boolean canChange(String start, String target) {
        int n = start.length();
        for (int i = 0; i < n; i++) {
            char s = start.charAt(i);
            char t = target.charAt(i);
            if (s==t){
                continue;
            }
            if (t=='L'){

            }
        }
        return false;
    }
}
