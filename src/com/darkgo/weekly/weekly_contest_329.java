package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/22
 */
public class weekly_contest_329 {
    public static void main(String[] args) {

    }

    public int alternateDigitSum(int n) {
        int ans = 0;
        int flag = 1;
        while (n > 0) {
            ans += n % 10 * flag;
            n = n / 10;
            flag *= -1;
        }
        return ans * -flag;
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (o1, o2) -> o2[k] - o1[k]);
        int m = score.length;
        int n = score[0].length;
        int[][] ans = new int[m][n];
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            pairs.add(new Pair(i, score[i][k]));
        }
        pairs.sort((o1, o2) -> o2.value - o1.value);
        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);
            int id = pair.id;
            for (int j = 0; j < n; j++) {
                ans[i][j] = score[id][j];
            }
        }
        return ans;
    }

    class Pair {
        int id;
        int value;
        public Pair(int id, int value) {
            this.id = id;
            this.value = value;
        }
    }

    public boolean makeStringsEqual(String s, String target) {
        int n = s.length();
        int ones1 = 0;
        int zeros1 = 0;
        int ones2 = 0;
        int zeros2 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            char c1 = target.charAt(i);
            if (c - '0' == 0) {
                zeros1++;
            } else {
                ones1++;
            }
            if (c1 - '0' == 0) {
                zeros2++;
            } else {
                ones2++;
            }
        }

        return ones1 == ones2 || zeros1 > 0 && ones1 > 0;
    }
}
