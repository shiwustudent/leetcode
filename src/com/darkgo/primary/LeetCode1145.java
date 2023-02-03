package com.darkgo.primary;

import com.darkgo.note.TreeNode;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/3
 */
public class LeetCode1145 {
    private int x, leftSize, rightSize;

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        this.x = x;
        dfs(root);
        return Math.max(leftSize, Math.max(rightSize, n - 1 - leftSize - rightSize)) * 2 > n;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lf = dfs(root.left);
        int rf = dfs(root.right);
        if (root.val == x) {
            leftSize = lf;
            rightSize = rf;
        }
        return lf + rf + 1;

    }
}
