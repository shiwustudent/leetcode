package com.darkgo.primary;

import java.util.Arrays;
import java.util.Collections;

/**
 * <p>
 * 爱吃香蕉的珂珂
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/7
 */
public class LeetCode875 {
    public static void main(String[] args) {

    }

    private int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(pile, high);
        }
        int k = high;
        while (low < high) {
            int speed = low + (high - low) / 2;
            long time = getTime(piles, speed);
            if (time <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return k;
    }

    private long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            time += pile / speed;
        }
        return time;
    }
}
