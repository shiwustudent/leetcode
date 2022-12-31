package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/31
 */
public class LeetCode2037 {
    private int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
