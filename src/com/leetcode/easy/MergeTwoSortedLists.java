package com.leetcode.easy;

import com.leetcode.utils.ListNode;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-27
 * @time: 19:44
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(4);

        ListNode root2= new ListNode(1);
        root2.next = new ListNode(3);
        root2.next.next = new ListNode(4);

        ListNode r = new MergeTwoSortedLists().mergeTwoLists(root1, root2);
        while (r != null){
            System.out.println(r.val);
            r = r.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(-1);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p = root;
        while (p1 != null && p2 != null){
            if(p1.val > p2.val){
                p.next = p2;
                p2 = p2.next;
            }else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null){
            p.next = p1;
        }
        if (p2 != null){
            p.next = p2;
        }
        return root.next;
    }
}
