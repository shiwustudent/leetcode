package com.darkgo.primary;

/**
 * <p>
 * 数组元素积的符号
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/27
 */
public class LeetCode1822 {
    public int arraySign(int[] nums) {
        boolean flag = true;
        for (int num : nums) {
            if (num < 0) {
                flag = !flag;
            } else if (num == 0) {
                return 0;
            }
        }
        return flag ? 1 : -1;
    }
}
