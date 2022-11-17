package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/15
 */
public class LeetCode1710 {
    private int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> o2[1]-o1[1]);
        int n = boxTypes.length;
        int ans = 0;
        System.out.println(Arrays.deepToString(boxTypes));
        for (int[] boxType : boxTypes) {
            if (truckSize - boxType[0] >= 0) {
                truckSize = truckSize - boxType[0];
                ans += boxType[1];
            }
        }
        return ans;
    }
}
