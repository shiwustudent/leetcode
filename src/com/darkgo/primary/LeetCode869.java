package com.darkgo.primary;

/**
 * <p>
 * 重新排序得到 2 的幂
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/16
 */
public class LeetCode869 {
    public static void main(String[] args) {

    }

    public boolean reorderedPowerOf2(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] nums = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            nums[i] = chars[i] - '0';
        }
        int depth = 0;
        boolean[] used = new boolean[nums.length];

        StringBuilder sb = new StringBuilder();
        return dfs(nums, depth, used, sb);

    }

    private boolean dfs(int[] nums, int depth, boolean[] used, StringBuilder sb) {
        if (sb.length() > 0 && sb.charAt(0) == '0') {
            return false;
        }
        if (depth == nums.length) {
            int i = Integer.parseInt(sb.toString());
            if ((i & (i - 1)) == 0) {
                return true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                sb.append(nums[i]);
                boolean flag = dfs(nums, depth + 1, used, sb);
                if (flag) {
                    return true;
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return false;
    }
}
