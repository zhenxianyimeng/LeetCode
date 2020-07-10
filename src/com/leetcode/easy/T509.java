package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-10
 * @time: 15:48
 */
public class T509 {
    public static void main(String[] args) {
        System.out.println(new T509().fib(0));
    }

    public int fib(int N) {
        if(N==0 || N==1){
            return N;
        }
        int a =1;
        int b = 1;
        for (int i = 2; i <N ; i++) {
            int sum= a + b;
            a = b;
            b = sum;
        }
        return b;
    }

}
