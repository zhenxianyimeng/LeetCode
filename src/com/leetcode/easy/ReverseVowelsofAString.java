package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 16:22
 */
public class ReverseVowelsofAString {

    private Set<Character> set = new HashSet(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public String reverseVowels(String s) {
        if(s == null || s.length()<=1){
            return s;
        }
        char[] chs = s.toCharArray();
        int l = 0;
        int r = chs.length - 1;
        while (l <= r){
            if (l < s.length() -1 && !set.contains(chs[l])){
                l ++;
                continue;
            }
            if (r > 0 && !set.contains(chs[r])){
                r --;
                continue;
            }

            char temp = chs[r];
            chs[r] = chs[l];
            chs[l] = temp;
            r --;
            l ++;
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        String in = "aA";
        System.out.println(new ReverseVowelsofAString().reverseVowels(in));
    }
}
