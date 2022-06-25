package com.darkgo.primary;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 独特的电子邮件地址
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/25
 */
public class LeetCode929 {
    public static void main(String[] args) {
        numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"});
    }
    private static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails){
            int i = email.indexOf("@");
            String local = email.substring(0, i).split("\\+")[0];
            local = local.replace(".", "");
            set.add(local + email.substring(i));
        }
        return set.size();

    }
}
