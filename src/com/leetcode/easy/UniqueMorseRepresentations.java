package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zjb
 * @date 2018/7/3.
 */
public class UniqueMorseRepresentations {

    private static final String[] STRS = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        if(words==null){
            return 0;
        }else if(words.length == 1){
            return 1;
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i <words.length ; i++) {
            String str = words[i];
            char[] chs = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char ch : chs){
                sb.append(STRS[ch - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
