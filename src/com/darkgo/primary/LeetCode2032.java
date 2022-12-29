package com.darkgo.primary;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/29
 */
public class LeetCode2032 {
    private List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> setAns = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                setAns.add(i);
            }
            set2.add(i);
        }
        for (int i : nums3) {
            if (set1.contains(i) || set2.contains(i)) {
                setAns.add(i);
            }
        }
        return new ArrayList<>(setAns);

    }
}
