package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-04-07
 * @time: 12:53
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "aa";
        String t = "ab";
        System.out.println(new IsomorphicStrings().isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i <s.length() ; i++) {
            Character value = map.get(s.charAt(i));
            Character value2 = map2.get(t.charAt(i));
            if(value == null && value2 == null){
                map.put(s.charAt(i), t.charAt(i));
                map2.put(t.charAt(i), s.charAt(i));
            }else if(value == null ^ value2 == null){
                return false;
            }else if(!value.equals(t.charAt(i)) || !value2.equals(s.charAt(i))){
                return false;
            }

        }
        return true;
    }
}
