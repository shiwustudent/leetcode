package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/19
 */
public class LeetCode1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int ones = Arrays.stream(students).sum();
        int zeros = n - ones;
        for (int i = 0; i < n; i++) {
            if (sandwiches[i] == 1) {
                ones--;
            } else {
                zeros--;
            }
            if (ones < 0 || zeros < 0) {
                return n - i;
            }
        }
        return 0;
    }
}
