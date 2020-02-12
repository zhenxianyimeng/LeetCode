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

        return null;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list = new FindAllAnagramsInAString().findAnagrams(s, p);
        list.stream().forEach(e-> System.out.println(e));
    }
}
