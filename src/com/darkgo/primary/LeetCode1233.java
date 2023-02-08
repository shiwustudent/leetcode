package com.darkgo.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/8
 */
public class LeetCode1233 {
    private List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String s = ans.get(ans.size() - 1);
            s += "/";
            if (!folder[i].startsWith(s)) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}
