package com.darkgo.weekly;

import com.sun.source.doctree.SeeTree;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/1
 */
public class weekly_contest_326 {
    public static void main(String[] args) {
        System.out.println(minimumPartition("165462", 60));
    }

    private static int countDigits(int num) {
        String s = String.valueOf(num);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (num % c == 0) {
                ans++;
            }
        }
        return ans;
    }

    private static int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 2; j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    set.add(j);
                }
                while (nums[i] % j == 0) {
                    nums[i] /= j;
                }
            }
        }
        return set.size();
    }

    private static int minimumPartition(String s, int k) {
        int ans = 0;
        int n = s.length();
        int kLen = String.valueOf(k).length();
        int left = 0;
        while (left < n) {
            int i = kLen;
            while (i >= 0) {
                if (i == 0) {
                    return -1;
                }
                if (left + i <= n) {
                    int sub = Integer.parseInt(s.substring(left, left + i));
                    if (sub <= k) {
                        ans++;
                        left += i;
                        break;
                    }
                }
                i--;
            }
        }
        return ans;
    }

    private int[] closestPrimes(int left, int right) {
        int[] ans = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        if (list.size() < 2) {
            return new int[]{-1, -1};
        }
        int dif = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) < dif) {
                dif = list.get(i) - list.get(i - 1);
                ans[0] = list.get(i-1);
                ans[1] = list.get(i);
            }
        }
        return ans;
    }

    private static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
