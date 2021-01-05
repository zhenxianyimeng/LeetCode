package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-05
 * @time: 23:16
 */
public class T830 {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> lists = new T830().largeGroupPositions(s);
        for (List<Integer> list : lists){
            for(Integer i : list){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists = new ArrayList<>();
        if(s == null || s.length()<=2){
            return lists;
        }
        int left = 0;
        int right = 1;
        while (right < s.length()){
            if(s.charAt(right) == s.charAt(left)){
                right ++;
            }else {
                if(right - left >= 3){
                    List<Integer> list = new ArrayList<>();
                    list.add(left);
                    list.add(right -1);
                    lists.add(list);
                }
                left = right;
            }
        }
        if(right - left >= 3){
            List<Integer> list = new ArrayList<>();
            list.add(left);
            list.add(right -1);
            lists.add(list);
        }
        return lists;
    }
}
