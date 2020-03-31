package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-30
 * @time: 13:09
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] charsA = s.toCharArray();
        char[] charB = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : charsA){
            Integer count = map.get(ch);
            if(count == null){
                map.put(ch, 1);
            }else {
                map.put(ch, count + 1);
            }
        }
        for (char ch : charB){
            Integer count = map.get(ch);
            if(count == null){
                return false;
            }else {
                if(count == 1){
                    map.remove(ch);
                }else {
                    map.put(ch, count - 1);
                }
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}
