package com.darkgo.primary;

/**
 * <p>
 * 文件夹操作日志搜集器
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/9
 */
public class LeetCode1598 {
    private int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if ("./".equals(log)) {
                continue;
            } else if ("../".equals(log)) {
                if (depth > 0) {
                    depth--;
                }
            } else {
                depth++;
            }
        }
        return depth;
    }
}
