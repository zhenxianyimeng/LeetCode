package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-30
 * @time: 16:56
 */
public class T567 {

    public static void main(String[] args) {
        String a = "ab";
        String b = "eidbaooo";
        System.out.println(new T567().checkInclusion(a,b));
    }

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i <s1.length() ; i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0)+1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int left=0, right=0, valid=0;
        while (right < s2.length()){
            char c = s2.charAt(right);
            if (need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))){
                    valid ++;
                }
            }
            right ++;
            while (right - left >= s1.length()){
                if(valid == need.size()){
                    return true;
                }
                char leftC = s2.charAt(left);
                if(need.containsKey(leftC)){
                    if(need.get(leftC).equals(window.get(leftC))){
                        valid --;
                    }
                    Integer count = window.get(leftC);
                    if(count > 0){
                        window.put(leftC, count-1);
                    }
                }
                left ++;
            }
        }
        return false;
    }
}
