package com.darkgo.primary;

/**
 * <p>
 * 盛最多水的容器
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/10
 */
public class LeetCode11 {
    public static void main(String[] args) {

    }
    private int maxArea(int[] height) {
        int left=0, right = height.length-1;
        int max = 0;
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            max = Math.max(area,max);
            if(height[left]<=height[right]){
                left++;
            }else if(height[left]>height[right]){
                right--;
            }
        }
        return max;
    }
}
