package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import com.leetcode.utils.ListUtils;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-12
 * @time: 22:27
 */
public class T19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        ListNode node = new T19().removeNthFromEnd(head, 0);
        ListUtils.printLinkedList(node);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <=0){
            return head;
        }
        ListNode before = head;
        ListNode after = head;
        while (n >0 && after != null){
            after = after.next;
            n--;
        }
        if(n > 0){
            return head;
        }
        if(after == null){
            return before.next;
        }
        while (after.next != null){
            before = before.next;
            after = after.next;
        }
        before.next = before.next.next;
        return head;
    }
}
