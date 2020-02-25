package com.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-25
 * @time: 10:10
 */
public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(new MinimumWindowSubstring().minWindow(s, t));
    }

    public String minWindow(String s, String t) {
//        char[] needChars = t.toCharArray();
        String min = null;
        int left=0, right=0;
        Map<Character, Integer> needMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(needMap.containsKey(ch)){
                needMap.put(ch, needMap.get(ch) + 1);
            }else {
                needMap.put(ch, 1);
            }
        }

        int match = 0;
        while (right < s.length()){
            char ch = s.charAt(right);
            if (needMap.containsKey(ch)){
                if(windowMap.containsKey(ch)){
                    windowMap.put(ch, windowMap.get(ch) + 1);
                }else {
                    windowMap.put(ch, 1);
                }
                if(needMap.get(ch).equals(windowMap.get(ch))){
                    match++;
                }
            }
            right ++;
            boolean flag = false;
            while (match == needMap.size()){
                flag = true;
                ch = s.charAt(left);
                if(needMap.containsKey(ch)){
                    windowMap.put(ch, windowMap.get(ch) - 1);
                    if(windowMap.get(ch) < needMap.get(ch)){
                        match --;
                    }
                }
                left ++;
            }
            if(flag){
                String temp = s.substring(left-1, right);
                if(min == null || temp.length() < min.length()){
                    min = temp;
                }
            }
        }
        if(min == null){
            return "";
        }
        return min;
    }
}
