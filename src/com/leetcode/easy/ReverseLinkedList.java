package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import com.leetcode.utils.ListUtils;

import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-05-24
 * @time: 21:28
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode re = new ReverseLinkedList().reverseList(root);

        ListUtils.printLinkedList(re);
    }

    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        while (next != null){
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }
}
