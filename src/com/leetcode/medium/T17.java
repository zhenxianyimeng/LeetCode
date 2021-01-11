package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-11
 * @time: 23:29
 */
public class T17 {

    public static void main(String[] args) {
        String digits = "23";
        List<String> list = new T17().letterCombinations(digits);
        for (String str : list){
            System.out.println(str);
        }
    }

    private static HashMap<Integer, String> map = new HashMap<>();

    static {
         map.put(2, "abc");
         map.put(3, "def");
         map.put(4, "ghi");
         map.put(5, "jkl");
         map.put(6, "mno");
         map.put(7, "pqrs");
         map.put(8, "tuv");
         map.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return list;
        }
        temp(digits, 0, list, new StringBuilder());
        return list;
    }

    public void temp(String digits, int index, List<String> list, StringBuilder comb){
        if(index == digits.length()){
            list.add(comb.toString());
            return;
        }
        int key = digits.charAt(index) - '0';
        String s = map.get(key);
        for (int i = 0; i <s.length() ; i++) {
            comb = comb.append(s.charAt(i));
            temp(digits, index+1, list, comb);
            comb.deleteCharAt(index);
        }
    }

}
