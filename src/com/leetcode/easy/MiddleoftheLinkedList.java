package com.leetcode.easy;

import com.leetcode.utils.ListNode;

/**
 * @author zjb
 * @date 2019/1/8.
 */
public class MiddleoftheLinkedList {
    //快慢指针
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
//        listNode.next.next.next.next.next = new ListNode(6);
        ListNode re = middleNode(listNode);
        System.out.println(re.val);
    }

    public static ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
