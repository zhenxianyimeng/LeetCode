package com.leetcode.hard;

import com.leetcode.utils.ListNode;

import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-16
 * @time: 16:42
 */
public class T25 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode listNode = new T25().reverseKGroup(head, 2);
//        ListNode node = listNode;
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        int total = 0;
        while (node != null){
            total ++;
            node = node.next;
        }
        ListNode root = new ListNode(-1);
        ListNode cur = head;
        ListNode next = head.next;
        ListNode tempRoot = root;
        while (total >= k){
            for (int i = 0; i <k; i++) {
                cur.next = tempRoot.next;
                tempRoot.next = cur;
                cur = next;
                if(next != null){
                    next = next.next;
                }
            }
            for (int i = 0; i <k ; i++) {
                tempRoot = tempRoot.next;
            }
            total = total - k;
        }
        tempRoot.next =cur;
        return root.next;
    }
}
