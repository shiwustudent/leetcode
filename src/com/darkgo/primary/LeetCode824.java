package com.darkgo.primary;

public class LeetCode824 {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println(new Solution().toGoatLatin(sentence));
    }

    static class Solution {
        public String toGoatLatin(String sentence) {
            String[] s = sentence.split(" ");
            StringBuffer bf = new StringBuffer();
            for (int i = 0; i < s.length; i++) {
                char c = s[i].charAt(0);
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    bf.append(s[i]).append("ma");
                } else {
                    String substring = s[i].substring(1);
                    bf.append(substring).append(s[i].charAt(0)).append("ma");
                }
                bf.append("a".repeat(i + 1));
                if (i != s.length - 1) {
                    bf.append(" ");
                }
            }
            return bf.toString();
        }
    }
}
