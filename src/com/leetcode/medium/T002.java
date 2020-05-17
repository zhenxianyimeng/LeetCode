package com.leetcode.medium;

import com.leetcode.utils.ListNode;

import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-17
 * @time: 17:49
 */
public class T002{

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode re = new T002().addTwoNumbers(l1, l2);
        while (re != null){
            System.out.println(re.val);
            re = re.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode re = new ListNode(-1);
        ListNode node = re;
        boolean flag = false;
        while (l1 !=null && l2 !=null){
            int num = l1.val + l2.val;
            if(flag){
                num = num + 1;
                flag = false;
            }
            if(num >= 10){
                num = num % 10;
                flag = true;
            }
            node.next = new ListNode(num);
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int num = l1.val;
            if(flag){
                num = num + 1;
                flag = false;
            }
            if(num >= 10){
                num = num % 10;
                flag = true;
            }
            node.next = new ListNode(num);
            node = node.next;
            l1 = l1.next;
        }
        while (l2 != null){
            int num = l2.val;
            if(flag){
                num = num + 1;
                flag = false;
            }
            if(num >= 10){
                num = num % 10;
                flag = true;
            }
            node.next = new ListNode(num);
            node = node.next;
            l2 = l2.next;
        }
        if(flag){
            node.next = new ListNode(1);
        }
        return re.next;
    }
}
