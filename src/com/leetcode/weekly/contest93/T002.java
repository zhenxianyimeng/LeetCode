package com.leetcode.weekly.contest93;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjb
 * @date 2018/7/15.
 */
public class T002 {
    public static void main(String[] args) {
//        System.out.println(isTrue(2));
//        System.out.println(isTrue(3));
        System.out.println(reorderedPowerOf2(116617277));
//        System.out.println(reorderedPowerOf2(1));
//        System.out.println(reorderedPowerOf2(10));
//        System.out.println(reorderedPowerOf2(16));
//        System.out.println(reorderedPowerOf2(24));
//        System.out.println(reorderedPowerOf2(46));

    }

    public static boolean reorderedPowerOf2(int N) {
        List<String> list = new LinkedList<>();
        char[] arr = String.valueOf(N).toCharArray();
        arrange(arr, 0, arr.length, list);
        for(String t : list){
            if(t.startsWith("0") || t.length() != arr.length){
                continue;
            }
            if(isTrue(Integer.valueOf(t))){
                return true;
            }
        }
        return false;
    }

    public static void arrange(char[] chs, int start, int len, List<String> list){
        if(start == len-1){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<chs.length; ++i) {
                sb.append(chs[i]);
            }
            list.add(sb.toString());
            return;
        }
        for(int i=start; i<len; i++){
            char temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
            arrange(chs, start+1, len, list);
            temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
        }
    }


    public static boolean isTrue(int n){
        return (n & n-1)==0;
    }
}
