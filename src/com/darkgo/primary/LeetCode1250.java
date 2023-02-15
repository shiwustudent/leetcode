package com.darkgo.primary;

/**
 * <p>
 *  gcd(a,b)=c, ax+by=c的倍数
 *  求整个数组的gcd是否为1
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/15
 */
public class LeetCode1250 {
    private boolean isGoodArray(int[] nums) {
        int d = nums[0];
        for(int num:nums){
            d = gcd(num,d);
        }
        return d==1;
    }

    private int gcd(int num, int d) {
        return d == 0 ? num : gcd(d, num % d);
    }

}
