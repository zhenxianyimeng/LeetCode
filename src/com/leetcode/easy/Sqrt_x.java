package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-09
 * @time: 19:37
 */
public class Sqrt_x {
    public static void main(String[] args) {
        System.out.println(new Sqrt_x().mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        long l = 0;
        long r = x;
        while (l < r){
            long mid = l + (r - l )/2 + 1 ;
            long mul = mid * mid;
            if(mul == x){
                return (int)mid;
            }else if(mul > x){
                r = mid - 1;
            }else {
                l = mid;
            }
        }
        return (int) l;
    }
}
