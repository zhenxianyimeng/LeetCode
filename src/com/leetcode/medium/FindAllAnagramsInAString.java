package com.leetcode.medium;

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
        char[] chars1 = p.toCharArray();
        int[] needs = new int[26];
        for (char ch : chars1){
            needs[ch - 'A'] ++;
        }
        int left=0, right=0;
        char[] chars = s.toCharArray();
        while (right < chars.length){

        }
        return null;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list = new FindAllAnagramsInAString().findAnagrams(s, p);
        list.stream().forEach(e-> System.out.println(e));
    }
}
