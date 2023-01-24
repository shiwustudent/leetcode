package com.darkgo.weekly;


import com.darkgo.note.GCD;

import java.util.*;


/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/21
 */
public class biweekly_contest_96 {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 3, 2};
        int[] num2 = {2, 1, 3, 4};
        maxScore(num1, num2, 3);
    }

    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public long minOperations(int[] nums1, int[] nums2, int k) {
        int n = nums2.length;
        long min = 0;
        if (Arrays.stream(nums1).sum() != Arrays.stream(nums2).sum()) {
            return -1;
        }
        if (k == 0) {
            return Arrays.equals(nums1, nums2) ? 0 : -1;
        }
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums1[i] == nums2[i]) {
                continue;
            }
            boolean flag = true;
            if (nums1[i] > nums2[i]) {
                flag = true;
            } else if (nums1[i] < nums2[i]) {
                flag = false;
            }
            int dif = Math.abs(nums1[i] - nums2[i]);
            if (dif % k != 0) {
                return -1;
            }
            if (flag) {
                min += dif % k;
                cnt += dif / k;
            } else {
                min -= dif % k;
            }
        }
        return min == 0 ? cnt : -1;
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums2.length;
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (o1, o2) -> nums2[o2] - nums2[o1]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long res = 0;
        long sum = 0;
        for (Integer integer : index) {
            int x = nums1[integer];
            int y = nums2[integer];
            if (minHeap.size() > k - 1) {
                sum -= minHeap.poll();
            }
            minHeap.offer(x);
            sum += x;

            if (minHeap.size() == k) {
                res = Math.max(res, sum * y);
            }
        }
        return res;
    }

    /**
     * (x, y - x)
     * (x - y, y) gcd
     * <p>
     * (2 * x, y)
     * (x, 2 * y) 2的幂
     *
     * @param targetX
     * @param targetY
     * @return
     */
    public boolean isReachable(int targetX, int targetY) {
        int gcd = gcd(targetX, targetY);
        return (gcd & (gcd - 1)) == 0;
    }

    private int gcd(int m, int n) {
        while (n > 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
}
