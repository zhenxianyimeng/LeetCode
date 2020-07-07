package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-25
 * @time: 17:26
 */
public class T139 {

    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList(new String[]{"cats", "dog", "sand", "and", "cat"});
        System.out.println(new T139().wordBreak(s, wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        set.addAll(wordDict);
        for(String str : wordDict){
            s = s.replaceAll(str, "-");
        }
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c!='-'){
                return false;
            }
        }
        return true;
    }
}
