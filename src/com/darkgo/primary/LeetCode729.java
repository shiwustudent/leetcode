package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 我的日程安排表 I
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/5
 */
public class LeetCode729 {
    // TODO 添加二分查找的解
    private class MyCalendar {
        List<int[]> booked;
        public MyCalendar() {
            booked = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            end--;
            for(int[] arr:booked){
                int l = arr[0],r = arr[1];
                if(start>r || end<l){
                    continue;
                }else{
                    return false;
                }
            }
            booked.add(new int[]{start, end});

            return true;
        }
    }
}
