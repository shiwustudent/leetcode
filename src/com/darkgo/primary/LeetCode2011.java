package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/23
 */
public class LeetCode2011 {
    private int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String operation:operations){
            if('-'==operation.charAt(1)){
                ans--;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
