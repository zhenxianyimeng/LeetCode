package com.leetcode.easy;

/**
 * @author zjb
 * @date 2019/3/15.
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int N) {
        if(N==1 || N==0){
            return N;
        }
        int a = 0; int b = 1;
        for (int i = 2; i <=N ; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
