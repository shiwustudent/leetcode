package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/31
 */
public class LeetCode481 {
    private int magicalString(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = arr[2] = 2;
        int j = 3;
        int i = 2;
        int ans = 1;
        while (j < n) {
            int size = arr[i];
            int num = arr[i] ^ 3;
            while (j < n && size > 0) {
                arr[j] = num;
                if (arr[j] == 1) {
                    ans++;
                }
                j++;
                size--;
            }
            i++;
        }
        return ans;
    }
}
