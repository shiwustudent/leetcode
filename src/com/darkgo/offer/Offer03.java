package com.darkgo.offer;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 数组中重复的数字
 * </p>
 * 重复用set
 * @author ShiWu
 * @since 2022/5/12
 */
public class Offer03 {
    public static void main(String[] args) {

    }
    private int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }
}
