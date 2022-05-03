package com.darkgo.primary;

import java.util.*;
import java.util.stream.IntStream;

/**
 * <p>
 * 重新排列日志文件
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/3
 */
public class LeetCode937 {
    public static void main(String[] args) {
        // String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        // String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        String[] logs = {"zoey i love you","lucas i love you","rong i love you"};

        System.out.println(Arrays.toString(new Solution().reorderLogFiles(logs)));
    }

    static class Solution {
        public String[] reorderLogFiles(String[] logs) {
            List<String> list = new ArrayList<>();
            List<String> digitList = new ArrayList<>();
            for (int i = 0; i < logs.length; i++) {
                int j = logs[i].indexOf(" ", 0) + 1;
                if (Character.isDigit(logs[i].charAt(j))) {
                    digitList.add(logs[i]);
                } else {
                    list.add(logs[i]);
                }
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int j = o1.indexOf(" ", 0) + 1;
                    String new_o1 = o1.substring(j);
                    int k = o2.indexOf(" ", 0) + 1;
                    String new_o2 = o2.substring(k);
                    String[] l = new String[]{new_o1, new_o2};
                    Arrays.sort(l);
                    //考虑相同的情况
                    if (new_o1.equals(new_o2)) {
                        return o1.substring(0, j).compareTo(o2.substring(0, k));
                    }
                    if (l[0].equals(new_o1)) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            String[] ans = new String[logs.length];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            for (int i = 0; i < digitList.size(); i++) {
                ans[i + list.size()] = digitList.get(i);
            }
            return ans;

        }
    }
}
