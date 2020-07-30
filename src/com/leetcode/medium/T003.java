package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-30
 * @time: 15:27
 */
public class T003 {

    public static void main(String[] args) {
        String str = "";
        System.out.println(new T003().lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int res = 1;
        while (right < s.length()){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);
            right ++;
            while (map.get(c) > 1){
                char leftC = s.charAt(left);
                Integer countL = map.getOrDefault(leftC, 0);
                if(countL > 0){
                    map.put(leftC, countL-1);
                }
                left ++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
