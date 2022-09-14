package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 删除某些元素后的数组均值
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/14
 */
public class LeetCode1619 {
    private double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int deletedCount = (int) (n*0.05);
        double sum = 0;
        for(int i=deletedCount;i<n-deletedCount;i++){
            sum+=arr[i];
        }
        return sum/(n-2*deletedCount);
    }
}
