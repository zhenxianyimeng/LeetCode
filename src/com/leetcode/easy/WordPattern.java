package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-31
 * @time: 13:12
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        char[] chars = pattern.toCharArray();
        String[] words = str.split(" ");
        if(chars.length != words.length){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i <chars.length ; i++) {
            String s = map.get(chars[i]);
            Character c = map2.get(words[i]);
            if(s==null ^ c==null){
                return false;
            }
            if(s == null){
                map.put(chars[i], words[i]);
            } else {
                if(!s.equals(words[i])){
                    return false;
                }
            }
            if(c == null){
                map2.put(words[i], chars[i]);
            }else {
                if(!c.equals(chars[i])){
                    return false;
                }
            }


        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "aaaa";
        String str = "dog cat cat dog";
        System.out.println(new WordPattern().wordPattern(pattern,str));
    }
}
