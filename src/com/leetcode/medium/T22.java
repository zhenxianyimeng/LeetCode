package com.leetcode.medium;

import com.leetcode.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-12-27
 * @time: 23:24
 */
public class T22 {

    public static void main(String[] args) {
//        ListUtils.printLinkedList();
        List<String> list = new T22().generateParenthesis(3);
        for (String str : list){
            System.out.println(str);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if(n == 0){
            return list;
        }
        trackBack("", n, n, list);
        return list;
    }

    private void trackBack(String str , int left, int right, List<String> list){
        if(left == 0 && right == 0){
            list.add(str);
            return;
        }
        if(left > right){
            return;
        }
        if(left > 0){
            trackBack(str + "(", left-1, right, list);
        }
        if(right > 0){
            trackBack(str + ")", left, right-1, list);
        }
//        return;
    }
}
