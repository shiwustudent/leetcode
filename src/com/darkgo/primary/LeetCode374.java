package com.darkgo.primary;

/**
 * <p>
 * 猜数字大小
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/26
 */
public class LeetCode374 {
    private int guessNumber(int n) {
        int left = 1,right = n;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(guess(mid)==0){
                return mid;
            }else if(guess(mid)==-1){
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return left;
    }

    private int guess(int mid) {
        return 0;
    }
}
