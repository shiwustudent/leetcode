package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 * 第 88 场双周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/1
 */
public class biweekly_contest_88 {
    public boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {
            StringBuilder deleted = new StringBuilder(word);
            deleted.deleteCharAt(i);
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : deleted.toString().toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                list.add(value);
            }
            Integer temp = list.get(0);
            boolean flag = true;
            for (Integer integer : list) {
                if (!Objects.equals(integer, temp)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    class LUPrefix {
        int[] prefix;
        int index = 0;

        public LUPrefix(int n) {
            prefix = new int[n + 1];
        }

        public void upload(int video) {
            prefix[video] = 1;
            if (video == 1) {
                index = 1;
            }
        }

        public int longest() {
            for (int i = index; i < prefix.length; i++) {
                if (prefix[i] == 1) {
                    index = i;
                } else {
                    break;
                }
            }
            return index;
        }
    }

    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans = 0;
        if (m%2 == 1) {
            for (int j : nums2) {
                ans ^= j;
            }
        }
        if (n%2 == 1) {
            for (int j : nums1) {
                ans ^= j;
            }
        }
        return ans;
    }

}
