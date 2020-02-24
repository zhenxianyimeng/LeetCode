package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-12
 * @time: 23:15
 */
public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] chars1 = p.toCharArray();
        int[] needs = new int[26];
        int[] windows = new int[26];
        for (char ch : chars1){
            needs[ch - 'a'] ++;
        }
        int left=0, right=0;
        int match = 0;
        char[] chars = s.toCharArray();
        int needLength = 0;
        for (int need : needs) {
            if(need > 0){
                needLength++;
            }
        }
        while (right < chars.length){
            char ch = chars[right];
            int index = ch - 'a';
            if(needs[index] > 0){
                windows[index] ++;
                if(windows[index] == needs[index]){
                    match ++;
                }
            }
            right ++;
            while (match == needLength){
                if(right - left == chars1.length) {
                    list.add(left);
                }
                ch = chars[left];
                index = ch - 'a';
                if(needs[index] > 0){
                    windows[index] -- ;
                    if(windows[index] < needs[index]){
                        match --;
                    }
                }
                left ++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list = new FindAllAnagramsInAString().findAnagrams(s, p);
        list.stream().forEach(e-> System.out.println(e));
    }
}
