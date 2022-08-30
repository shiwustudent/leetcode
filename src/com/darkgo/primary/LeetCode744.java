package com.darkgo.primary;

/**
 * <p>
 * 寻找比目标字母大的最小字母
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/30
 */
public class LeetCode744 {
    // 二分
    private char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if (target >= letters[n - 1]) {
            return letters[0];
        }
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return letters[left];
    }

    // 枚举
    private char nextGreatestLetter1(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
}
