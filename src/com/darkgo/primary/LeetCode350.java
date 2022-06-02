package com.darkgo.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode350 {

    public static void main(String[] args) {
        // write your code here
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect1(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : nums1) {
            int count = map1.getOrDefault(i, 0) + 1;
            map1.put(i, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int i : nums2) {
            int count = map1.getOrDefault(i, 0);
            if (count > 0) {
                intersection[index++] = i;
                count--;
                if (count > 0) {
                    map1.put(i, count);
                } else {
                    map1.remove(i);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0, index2 = 0, index = 0;
        int length = nums1.length;
        int length2 = nums2.length;
        int[] intersection = new int[Math.min(length, length2)];

        while (index1 < length || index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index++] = nums1[index1];
                index1++;
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}