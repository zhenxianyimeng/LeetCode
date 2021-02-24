package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-02-24
 * @time: 23:09
 */
public class T5 {

    public static void main(String[] args) {
        String s = "ac";
        System.out.println(new T5().longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return s;
        }
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i <length ; i++) {
            dp[i][i] = true;
        }
        int mLen = 1;
        int begin = 0;
        for (int i = 1; i <length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(s.charAt(j) != s.charAt(i)){
                    dp[j][i] = false;
                }else {
                    if(i - j == 1){
                        dp[j][i] = true;
                    }else {
                        dp[j][i] = dp[j+1][i-1];
                    }
                }
                if(dp[j][i] && i-j+1 > mLen){
                    mLen = i-j+1;
                    begin = j;
                }
            }
        }

        return  s.substring(begin, begin + mLen);
    }
}
