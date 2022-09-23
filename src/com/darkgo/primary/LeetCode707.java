package com.darkgo.primary;

/**
 * <p>
 * 设计链表
 * </p>
 *
 * //TODO 双链表
 * @author ShiWu
 * @since 2022/9/23
 */
public class LeetCode707 {
    class MyLinkedList {
        int size;
        ListNode head;


        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            index = Math.max(0, index);
            size++;
            ListNode pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            ListNode add = new ListNode(val);
            add.next = pred.next;
            pred.next = add;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            size--;
            ListNode del = head;
            for (int i = 0; i < index; i++) {
                del = del.next;
            }
            del.next = del.next.next;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
