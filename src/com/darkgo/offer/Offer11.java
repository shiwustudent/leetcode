package com.darkgo.offer;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/16
 */
public class Offer11 {
    public static void main(String[] args) {
        System.out.println(minArray(new int[]{3, 1, 3}));
    }

    private static int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid +1;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
