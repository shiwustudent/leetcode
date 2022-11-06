package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/6
 */
public class LeetCode1678 {
    public String interpret(String command) {
        return command.replace("()", "0").replace("(al)", "al");
    }
}
