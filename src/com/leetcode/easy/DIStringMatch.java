package com.leetcode.easy;

import java.util.Arrays;

/**
 * @author zjb
 * @date 2019/1/20.
 */
public class DIStringMatch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }

    public static int[] diStringMatch(String S) {
        if(S == null || "".equals(S)){
            return null;
        }
        char[] chs = S.toCharArray();
        int[] arr = new int[chs.length+1];
        int left = 0;
        int right = chs.length;
        int last = 0;
        for (int i = 0; i <chs.length ; i++) {
            if(chs[i] == 'I'){
                arr[i] = left;
                last = ++left;
            }else if(chs[i] == 'D'){
                arr[i] = right;
                last = --right;
            }
        }
        arr[chs.length] = last;
        return arr;
    }
}
