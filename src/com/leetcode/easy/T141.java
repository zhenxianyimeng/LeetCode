package com.leetcode.easy;

import com.leetcode.utils.ListNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-19
 * @time: 14:07
 * 3 2 0 4 2
 */
public class T141 {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
//        head.next = head;
//        ListNode node2 = new ListNode(2);
//        head.next = node2;
//        node2.next = new ListNode(0);
//        node2.next.next = new ListNode(4);
//        node2.next.next.next = node2;
        System.out.println(new T141().hasCycle(head));
    }
}
