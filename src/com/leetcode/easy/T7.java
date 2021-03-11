package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-03-10
 * @time: 23:46
 */
public class T7 {
    public static void main(String[] args) {
        System.out.println(new T7().reverse(-123));
    }

    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
