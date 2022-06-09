package com.darkgo.primary;

/**
 * <p>
 * 跳跃游戏
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/9
 */
public class LeetCode55 {
    public static void main(String[] args) {

    }
    private boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(i<=max){
                max = Math.max(i+nums[i],max);
            }else{
                return false;
            }
        }
        return true;
    }
}
