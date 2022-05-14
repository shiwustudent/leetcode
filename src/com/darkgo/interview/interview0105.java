package com.darkgo.interview;

/**
 * <p>
 * 一次编辑
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/13
 */
public class interview0105 {
    public static void main(String[] args) {
        String first = "islander", second = "slander";
        System.out.println(oneEditAway(first, second));
    }

    private static boolean oneEditAway(String first, String second) {
        int length = first.length();
        int lengthSecond = second.length();
        if (Math.abs(length - lengthSecond) > 1) {
            return false;
        }
        if (length == lengthSecond) {
            boolean foundDifference = false;
            for (int i = 0; i < length; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (!foundDifference) {
                        foundDifference = true;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        if (length > lengthSecond) {
            return oneInsert(second, first);
        } else {
            return oneInsert(first, second);
        }
    }

    private static boolean oneInsert(String first, String second) {
        int index1 = 0, index2 = 0;
        while (index1 < first.length() && index2 < second.length()) {
            if (first.charAt(index1) == second.charAt(index2)) {
                index1++;
            }
            index2++;
            if (index2 - index1 > 1) {
                return false;
            }
        }
        return true;
    }
}
