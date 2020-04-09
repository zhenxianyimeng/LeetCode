package com.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-04-09
 * @time: 12:47
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            Integer value = map.get(ch);
            if(value == null){
                map.put(ch, 1);
            }else {
                map.put(ch, value + 1);
            }
        }
        List<Map.Entry<Character, Integer>> collects = map.entrySet().stream().sorted((e1, e2)->{
           return e2.getValue().compareTo(e1.getValue());
        }).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : collects) {
            for (int i = 0; i <entry.getValue() ; i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "tree";
        System.out.println(new SortCharactersByFrequency().frequencySort(str));
    }
}
