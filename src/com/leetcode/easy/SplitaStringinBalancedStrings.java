package com.leetcode.easy;

import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-10-24
 * @time: 19:59
 */
public class SplitaStringinBalancedStrings {

    public static void main(String[] args) {
        SplitaStringinBalancedStrings balancedStrings = new SplitaStringinBalancedStrings();
        System.out.println(balancedStrings.balancedStringSplit("RRLRRLRLLLRL"));
    }

    public int balancedStringSplit(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for(char ch : chs){
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(!stack.isEmpty()){
                char temp = stack.peek();
                if(temp != ch){
                    stack.pop();
                    if(stack.isEmpty()){
                        num++;
                    }
                }else {
                    stack.push(ch);
                }
            }
        }
        return num;
    }
}
