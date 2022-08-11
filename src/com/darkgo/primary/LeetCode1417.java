package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 重新格式化字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/11
 */
public class LeetCode1417 {
    public static void main(String[] args) {
        reformat("covid2019");
    }
    private static String reformat(String s) {
        char[] chars = s.toCharArray();
        List<Character> nums= new ArrayList<>();
        List<Character> charlist= new ArrayList<>();
        for(char c:chars){
            if(Character.isDigit(c)){
                nums.add(c);
            }else{
                charlist.add(c);
            }
        }
        if(Math.abs(nums.size()-charlist.size())>1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = nums.size()+charlist.size();
        int m = nums.size(),n = charlist.size();
        while(sb.length()<length){
            if(m>n){
                sb.append(nums.get(--m));
            }else if(m<n){
                sb.append(charlist.get(--n));
            }else{
                if(sb.length()==0){
                    sb.append(nums.get(--m));
                }else{
                    char c =sb.toString().substring(sb.length()-1).charAt(0);
                    if(Character.isDigit(c)){
                        sb.append(charlist.get(--n));
                    }else{
                        sb.append(nums.get(--m));
                    }
                }
            }
        }
        return sb.toString();
    }
}
