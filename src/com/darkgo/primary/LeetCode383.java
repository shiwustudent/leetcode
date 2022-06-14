package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * 赎金信
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/14
 */
public class LeetCode383 {
    public static void main(String[] args) {

    }

    private boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapNote = new HashMap<>();
        HashMap<Character, Integer> mapMag = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            mapNote.put(c, mapNote.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            mapMag.put(c, mapMag.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mapNote.entrySet()) {
            Character c = entry.getKey();
            if (mapMag.getOrDefault(c, 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private boolean canConstruct1(String ransomNote, String magazine) {
        if (magazine.length()<ransomNote.length()){
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if (cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
