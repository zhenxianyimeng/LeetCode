package com.leetcode.medium;

import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-28
 * @time: 20:06
 */
public class T394 {
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        System.out.println(new T394().decodeString(str));
    }

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sbf = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(ch == ']'){
                Character pop = stack.pop();
                StringBuilder sb = new StringBuilder();
                while (pop != '['){
                    sb.append(pop);
                    pop = stack.pop();
                }
                sb.append(sbf);
                int time = stack.pop() - '0';
                sbf = new StringBuilder();
                for (int j = 0; j <time ; j++) {
                    sbf.append(sb);
                }
            }else {
                stack.push(ch);
            }
        }
        return sbf.toString();
    }
}
