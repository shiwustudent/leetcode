package com.darkgo.primary;

/**
 * <p>
 * 生成每种字符都是奇数个的字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/1
 */
public class LeetCode1374 {
    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        if(n%2==0){
            builder.append("a".repeat(n-1));
            builder.append("b");
        }else{
            builder.append("a".repeat(n));
        }
        return builder.toString();
    }

}
