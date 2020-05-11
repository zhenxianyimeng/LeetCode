package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-11
 * @time: 13:54
 */
public class T49GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new T49GroupAnagrams().groupAnagrams(arr));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] arr = new int[26];
            for (int i = 0; i <str.length() ; i++) {
                char c = str.charAt(i);
                arr[c- 'a'] ++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <26 ; i++) {
                int num = arr[i];
                if(num == 0){
                    sb.append("#");
                }else {
                    sb.append(num);
                }
            }
            String key = sb.toString();
            List<String> list = map.get(key);
            if(list == null){
                List<String> t = new ArrayList<>();
                t.add(str);
                map.put(key, t);
            }else {
                list.add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
