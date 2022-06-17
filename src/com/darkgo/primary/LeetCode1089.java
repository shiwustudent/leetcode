package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 复写零
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/17
 */
public class LeetCode1089 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 0, 3, 3};
        duplicateZeros(arr);
    }

    private static void duplicateZeros(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < length - 1; j++) {
                    arr[j + 1] = arr[j];
                }
                if (i < length - 1) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }

    }

    private static void duplicateZeros1(int[] arr) {
        int i = 0;
        int top = 0;
        int n = arr.length;
        while (top < n) {
            if (arr[i] == 0) {
                top++;
            }
            top++;
            i++;
        }
        int j = n - 1;
        if (top == n + 1) {
            arr[j] = 0;
            j--;
            i--;
        }
        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[j] == 0) {
                arr[j] = arr[i];
            }
            i--;
        }
    }
}
