package com.darkgo.primary;

import com.darkgo.note.ListNode;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/30
 */
public class LeetCode1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1;
        while(a!=1){
            pre=pre.next;
            a--;
        }
        ListNode end = list1;
        while(b!=0){
            end = end.next;
            b--;
        }
        end = end.next;
        pre.next = list2;
        while(pre!=null && pre.next !=null){
            pre = pre.next;
        }
        pre.next = end;
        return list1;
    }
}
