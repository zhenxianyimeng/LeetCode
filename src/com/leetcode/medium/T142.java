package com.leetcode.medium;

import com.leetcode.easy.T141;
import com.leetcode.utils.ListNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-21
 * @time: 19:36
 */
public class T142 {

    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            if(fast == slow){
                ListNode p = head;
                int i=0;
                slow = slow.next;
                while (slow != p){
                    slow = slow.next;
                    p = p.next;
                    i++;
                }
                return new ListNode(i);
            }

            fast = fast.next.next;
            slow = slow.next;

        }

        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
//        head.next = head;
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(4);
//        head.next = head;
        ListNode node2 = new ListNode(2);
        head.next = node2;
        node2.next = new ListNode(0);
        node2.next.next = new ListNode(4);
        node2.next.next.next = node2;
        System.out.println(new T142().detectCycle(head).val);
    }
}

