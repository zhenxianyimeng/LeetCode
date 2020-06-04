package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-02
 * @time: 19:51
 */
public class T64 {
    public static void main(String[] args) {
        System.out.println(new T64().sumNums(3));
    }

    public int sumNums(int n) {
        int re = 0;
        boolean flag = n>0 && (re = n + sumNums(n-1))>0;
        return re;
    }
}
