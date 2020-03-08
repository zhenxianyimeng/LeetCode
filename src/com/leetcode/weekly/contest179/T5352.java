package com.leetcode.weekly.contest179;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-08
 * @time: 11:01
 */
public class T5352 {
    public static void main(String[] args) {
        System.out.println(new T5352().generateTheString(4));
    }

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        char ch1 = 'a';
        char ch2 = 'b';
        for (int i = 0; i <n-1 ; i++) {
            sb.append(ch1);
        }
        if(n%2 == 0){
            sb.append(ch2);
        }else {
            sb.append(ch1);
        }
        return sb.toString();
    }
}
