package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-08-28
 * @time: 19:56
 */
public class T518 {

    public static void main(String[] args) {
        int[] coins = {2};
        System.out.println(new T518().change(3, coins));
    }

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <=coins.length; i++) {
            for (int j = 1; j <=amount ; j++) {
                if(j - coins[i-1] < 0){
                    dp[i][j] = dp[i-1][j];
                }else {
                    //放i位置的，和不放i未知的和
                    dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
}
