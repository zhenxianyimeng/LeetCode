package com.leetcode.utils;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-07-23
 * @time: 22:44
 */
public class ListUtils{

    public static void printLinkedList(ListNode root){
        ListNode temp = root;
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
