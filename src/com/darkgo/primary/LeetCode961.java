package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 在长度 2N 的数组中找出重复 N 次的元素
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/21
 */
public class LeetCode961 {
    public static void main(String[] args) {

    }
    private  int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int count  = map.getOrDefault(nums[i],0);
            if(count+1 == 2){
                return nums[i];
            }else{
                map.put(nums[i],count+1);
            }
        }
        return 0;
    }
}
