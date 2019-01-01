package com.leetcode.medium;

import java.util.*;

/**
 * @author zjb
 * @date 2019/1/1.
 */
public class FindandReplacePattern {

    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println((findAndReplacePattern(words, pattern)));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new LinkedList<>();
        int[] s = findArray(pattern);
        for(String word : words){
            int[] temp = findArray(word);
            if(Arrays.equals(s, temp)){
                list.add(word);
            }
        }

        return list;
    }

    public static int[] findArray(String word){
        int[] arr = new int[word.length()];
        char[] chs = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
//        arr[0] = index;
        for (int i = 0; i <chs.length ; i++) {
            if(map.containsKey(chs[i])){
                arr[i] = map.get(chs[i]);
            }else {
                map.put(chs[i], index);
                arr[i] = index;
                index++;
            }
        }
        return arr;
    }
}
