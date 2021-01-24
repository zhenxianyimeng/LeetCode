package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-25
 * @time: 00:12
 */
public class T20 {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(new T20().isValid(s));
    }

    private static Map<Character, Character> map = new HashMap<>();
    static {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(map.containsValue(c)){
                stack.push(c);
            }
            if(map.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if(pop != map.get(c)){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
